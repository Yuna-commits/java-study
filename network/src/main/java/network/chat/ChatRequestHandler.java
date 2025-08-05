package network.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ChatRequestHandler extends Thread {
	private final Socket socket;
	private final List<Writer> clientWriters;// client별 PrintWriter를 담는 List, 모든 통신 스레드에서 공유

	private String nickName;// 연결된 client의 닉네임
	
	public ChatRequestHandler(Socket socket, List<Writer> clientWriters) {
		this.socket = socket;
		this.clientWriters = clientWriters;
	}

	// client 모든 요청 처리
	@Override
	public void run() {
		try {
			// 1. 연결된 client의 정보 얻기
			InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();// client IP
			int remotePort = inetRemoteSocketAddress.getPort();// client Port

			// client와 연결 성공
			ChatServer.consoleLog("New client connected: [" + remoteHostAddress + ":" + remotePort + "]");

			// 2. 스트림 얻기 -> socket에 연결된 client의 IOStream을 사용
			/**
			 * server -> client 로 데이터 전송(socket.getOutputStream()) 
			 * server <- client 로 데이터 수신(socket.getInputStream())
			 * 문자열 한 줄 단위(readLine())로 데이터 전송/수신
			 */
			BufferedReader br = new BufferedReader(
					new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
			PrintWriter pw = new PrintWriter(
					new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);

			// 3. [JOIN, MESSAGE, QUIT] 요청 처리 loop
			while (true) {
				String request = br.readLine();
				
				// client : socket.close()
				if (request == null) {
					ChatServer.consoleLog("Connection closed by client");
					doQuit(pw);
					break;
				}

				// 4. JOIN, MESSAGE, QUIT 프로토콜 사용
				String[] tokens = request.split(":", 2);//최대 2개까지만 split
				//command 예시: JOIN:nickName\n -> tokens[0]: JOIN, tokens[1]: nickName
				CommandType command = CommandType.from(tokens[0]);
				
				switch(command) {
				case JOIN:
					doJoin(tokens[1], pw);
					break;
				case MESSAGE:
					doMessage(tokens[1]);
					break;
				case QUIT:
					doQuit(pw);
					break;
				default:
					ChatClient.consoleLog("error: Unknown request (" + tokens[0] + ")");
				}
			}

		} catch (SocketException e) {
			// SocketException : client가 비정상적으로 연결을 종료한 경우
			ChatServer.consoleLog("socket exception: " + e.getMessage());
		} catch (IOException e) {
			// IOException :
			ChatServer.consoleLog("I/O error: " + e.getMessage());
		} finally {
			try {
				// 소켓 닫기(소켓이 생성되지 않은 경우, 소켓이 이미 닫힌 경우 제외)
				if (socket != null && !socket.isClosed()) {
					socket.close();
				}
			} catch (IOException e) {
				ChatServer.consoleLog("I/O error: " + e.getMessage());
			}
		}
	}

	// server에 연결된(clientWriters에 저장됨) 모든 client(자기 자신 포함)에게 메시지 전송
	private void broadcast(String message) {
		synchronized (clientWriters) {
			for (Writer writer : clientWriters) {
				((PrintWriter) writer).println(message);
			}
		}
	}

	private void addWriter(Writer writer) {
		synchronized (clientWriters) {
			clientWriters.add(writer);
		}
	}

	// clientWriters에서 "QUIT"를 입력한 client 삭제
	private void removeWriter(Writer writer) {
		synchronized (clientWriters) {
			clientWriters.remove(writer);
		}
	}

	// JOIN 프로토콜
	private void doJoin(String nickName, Writer writer) {
		this.nickName = nickName;

		// clientWriters에 저장
		addWriter(writer);

		broadcast("[" + nickName + "] has joined the chat.");

		// client에 ACK 전송
		((PrintWriter) writer).println("JOIN:OK");
	}

	// MESSAGE 프로토콜 -> 메시지를 보낸 client의 닉네임이 보이도록
	private void doMessage(String message) {
		broadcast("[" + nickName + "]: " + message);
	}

	// QUIT 프로토콜
	private void doQuit(Writer writer) {
		removeWriter(writer);

		broadcast("[" + nickName + "] has left the chat.");
	}

}
