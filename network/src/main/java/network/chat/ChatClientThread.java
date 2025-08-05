package network.chat;

import java.io.BufferedReader;
import java.io.IOException;

public class ChatClientThread extends Thread {
	private final BufferedReader br;

	public ChatClientThread(BufferedReader br) {
		this.br = br;
	}

	// reader를 통해 읽은 다른 client의 broadcast 메시지 출력
	@Override
	public void run() {
		try {
			String message;
			//멀티 스레드이기 때문에 서버로부터 받은 메시지를 계속 출력해야 함
			while ((message = br.readLine()) != null) {
				System.out.println(message);
			}
		} catch (IOException e) {
			ChatClient.consoleLog("Disconnected from server.");
		}

	}
}
