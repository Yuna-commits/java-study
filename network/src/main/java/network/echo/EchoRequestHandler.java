package network.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

public class EchoRequestHandler extends Thread {
	private Socket socket;
	
	public EchoRequestHandler(Socket socket) {
		this.socket=socket;
	}

	@Override
	public void run() {
		try {
			InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();// 상대 IP
			int remotePort = inetRemoteSocketAddress.getPort();// 상대에게 할당된 Port

			EchoServer.log("connected by client [" + remoteHostAddress + " : " + remotePort + "]");

			// Base Stream
			InputStream is = socket.getInputStream();// client가 보낸 데이터를 바이트 단위로 읽음
			OutputStream os = socket.getOutputStream();// 바이트 단위로 데이터 전송

			// Stream Chaining -> Deco1(Deco2(Base))
			// PrintWriter: 문자 -> 바이트 변환, "UTF-8"로 인코딩해서 OutputStream에 전달
			// autoFlush = true -> println()을 호출하면 자동으로 flush()(버퍼에 쌓인 데이터를 강제로 전송) 호출
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(os, "UTF-8"), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

			// 데이터 읽기 -> client to server
			while (true) {
				String data = br.readLine();

				if (data == null) {
					EchoServer.log("closed by client");
					break;
				}

				EchoServer.log("received: " + data);

				// 데이터 쓰기 -> server to client
				pw.println(data);
			}
		} catch (SocketException e) {
			EchoServer.log("socket exception: " + e);
		} catch (IOException e) {
			EchoServer.log("error: " + e);
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
