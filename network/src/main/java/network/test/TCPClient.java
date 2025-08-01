package network.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClient {
	private static final String SERVER_IP = "127.0.0.1";// loopback IP

	public static void main(String[] args) {
		Socket socket = null;
		try {
			// 1. Socket 생성
			socket = new Socket();

			// 2. Server Connect
			// -> server의 IP, Port에 연결
			socket.connect(new InetSocketAddress(SERVER_IP, TCPServer.PORT));

			// 3. IOStream 가져오기, 1) write 2) read
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			// 4. 데이터 쓰기 -> client to server
			String data = "Hello World";
			// 바이트 배열로 변환하여 TCP를 통해 server로 바이트 단위 전송
			os.write(data.getBytes("UTF-8"));

			// 5. 데이터 읽기 -> server to client
			byte[] buffer = new byte[256];
			int readByteCount = is.read(buffer);

			if (readByteCount == -1) {// server에 의해 정상 종료
				System.out.println("[client] closed by server");
				return;
			}

			data = new String(buffer, 0, readByteCount, "UTF-8");
			System.out.println("[client] received: " + data);
		} catch (IOException e) {
			System.out.println("[client] error: " + e);
		} finally {
			try {
				if (socket != null && !socket.isClosed()) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
