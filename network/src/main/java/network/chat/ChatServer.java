package network.chat;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
	public static final int PORT = 9999;

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		List<Writer> clientWriters = null;// client별 PrintWriter를 담는 List

		try {
			// 1. 소켓 열기
			serverSocket = new ServerSocket();
			clientWriters = new ArrayList<Writer>();

			InetSocketAddress inetSocketAddress = new InetSocketAddress("0.0.0.0", PORT);
			String hostAddress = inetSocketAddress.getAddress().getHostAddress();

			// 2. 바인딩 inetSocketAddress)(host IP + PORT)
			serverSocket.bind(inetSocketAddress);
			consoleLog("Server is waiting for client connections..." + hostAddress + " : " + PORT);

			// 3. 요청 대기
			while (true) {
				Socket socket = serverSocket.accept();
				// client와 연결되면 채팅은 ChatRequestHandler에서 처리
				new ChatRequestHandler(socket, clientWriters).start();
			}
		} catch (IOException e) {
			// IOException : serverSocket.bind(), serverSocket.accept()에서 발생 가능
			consoleLog("I/O error: " + e.getMessage());
		} finally {
			try {
				// 4. 소켓 닫기
				if (serverSocket != null) {
					serverSocket.close();
				}
			} catch (IOException e) {
				// IOException : 이미 닫힌 소켓을 닫으려한 경우
				consoleLog("I/O error: " + e.getMessage());
			}
		}
	}

	// Log
	public static void consoleLog(String message) {
		System.out.println("[Chat Server] " + message);
	}
}
