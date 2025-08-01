package network.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TCPServer {
	public static final int PORT = 5000;

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		// serverSocket try-catch
		try {
			// 1. Server Socket 생성
			serverSocket = new ServerSocket();

			// 2. Binding
			// -> socket에 InetSocketAddress[InetAddress(IP Address + Port)]를 바인딩
			// IP Address: 0.0.0.0, 매우 다양한 특정 호스트 IP를 바인딩 하지 않음, 바인딩 할 때의 IP를 사용
			serverSocket.bind(new InetSocketAddress("0.0.0.0", PORT));

			// 3. Accept
			Socket socket = serverSocket.accept();// Blocking -> serverSocket과 Socket이 연결되면 해제됨

			// socket try-catch
			try {
				// 상대의 소켓 주소 반환(Ip+Port)
				// InetAddress <- InetSocketAddress, Down Casting
				InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
				String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();// 상대 IP
				int remotePort = inetRemoteSocketAddress.getPort();// 상대에게 할당된 Port
				// 연결 성공 로그
				System.out.println("[server] connected by client [" + remoteHostAddress + " : " + remotePort + "]");

				// 4. IOStream 받아오기, 1) read 2) write
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();

				// 5. 데이터 읽기 -> client to server
				while (true) {
					byte[] buffer = new byte[256];
					// socket으로 들어온 바이트를 읽어 buffer에 채움
					// -> 읽을 수 있는 바이트가 올 때까지 Blocking
					int readByteCount = is.read(buffer);

					if (readByteCount == -1) {// client에 의해 정상 종료
						// close by client
						System.out.println("[server] closed by client");
						break;
					}

					// 읽은 바이트 배열을 String으로 복원
					String data = new String(buffer, 0, readByteCount, "UTF-8");
					System.out.println("[server] recieved: " + data);

					// 6. 데이터 쓰기 -> server to client
					os.write(data.getBytes("UTF-8"));
				} // IOException <- SocketException, 예외 처리 순서 중요
			} catch (SocketException e) {// 비정상적인 종료일 때
				System.out.println("[server] Socket Exception: " + e);
			} catch (IOException e) {// 통신 에러
				System.out.println("[server] error: " + e);
			} finally {
				try {// socket이 연결됐고 아직 닫히지 않았을 때
					if (socket != null && !socket.isClosed()) {
						socket.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			System.out.println("[server] error: " + e);
		} finally {
			try {
				if (serverSocket != null) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
