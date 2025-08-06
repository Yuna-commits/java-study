package network.chat;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ChatClient {
	private static final String SERVER_IP = "127.0.0.1";

	public static void main(String[] args) {
		Scanner scanner = null;
		Socket socket = null;
		try {
			// 1. 키보드 연결
			scanner = new Scanner(new InputStreamReader(System.in, "MS949"));

			// 2. socket 생성
			socket = new Socket();

			// 3. 연결
			socket.connect(new InetSocketAddress(SERVER_IP, ChatServer.PORT));
			consoleLog("Connected to the chat server.");

			// 4. reader/writer 생성
			BufferedReader br = new BufferedReader(
					new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8),
					true);

			// 5. 채팅 시작
			while (true) {
				// client가 QUIT을 입력해도 소켓은 아직 열려있기 때문에 채팅을 계속할 수 있음
				startChat(scanner, br, pw);

				// 채팅 완전 종료 여부 -> 현재 연결된 클라이언트의 채팅을 종료
				consoleLog("Type \"EXIT\" to disconnect, or press Enter to rejoin.");
				String exit = scanner.nextLine();
				if (exit.equalsIgnoreCase("EXIT")) {
					consoleLog("Chat session ended. Goodbye!");
					break;
				}
			}

		} catch (IOException e) {
			consoleLog("I/O error: " + e.getMessage());
		} finally {
			try {
				// 7. 소켓, 스캐너 닫기
				if (socket != null && !socket.isClosed()) {
					socket.close();
				}
				if (scanner != null) {
					scanner.close();
				}
			} catch (IOException e) {
				// IOException : 이미 닫힌 소켓을 닫으려한 경우
				consoleLog("I/O error: " + e.getMessage());
			}
		}
	}

	private static void startChat(Scanner scanner, BufferedReader br, PrintWriter pw) throws IOException {
		// 6. JOIN
		System.out.print("Type your nickname>> ");
		String nickName = scanner.nextLine();

		pw.println("JOIN:" + nickName);

		/**
		 * JOIN:OK와 Type your command>> 출력 겹치는 문제 해결하기
		 * 아래 코드를 사용하면 첫번째 닉네임 입력에서 "JOIN:OK".equals(response)==false, 메인으로 돌아가버림
		 */
		// JOIN:OK 응답 대기
//		String response = br.readLine();
//		if ("JOIN:OK".equals(response)) {
//			consoleLog("Successfully joined the chat.");
//		} else {//현재 코드에서는 실행 x
//			consoleLog("Failed to join the chat: " + response);
//			return;
//		}
//		
		// 7. broadcast 메시지를 받기 위한 스레드 시작
		new ChatClientThread(br).start();

		// 8. MESSAGE, QUIT 키보드 입력 처리
		while (true) {
			System.out.print("Type your command>> ");
			String input = scanner.nextLine();
			CommandType command = CommandType.from(input);

			switch (command) {
			case QUIT:
				pw.println("QUIT:");
				consoleLog("You have left the chat.");
				return;// 채팅 종료 -> 소켓 연결은 살아있음
			case MESSAGE:
				System.out.print("Type your message>> ");
				String message = scanner.nextLine();
				pw.println("MESSAGE:" + message);
				break;
			default:
				consoleLog("error: Unknown command.");
			}
		}
	}

	// Log
	public static void consoleLog(String message) {
		System.out.println("[Chat Client] " + message);
	}
}
