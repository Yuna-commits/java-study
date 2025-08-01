package network.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * nslookup 구현 -> 입력한 DNS에 대응하는 IP 주소를 보여줌
 */
public class NSLookup {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// DNS 입력
			String line = inputDNS(scanner);
			if ("quit".equals(line)) {
				break;
			}
			try {
				// 등록된 모든 IP 주소를 배열로 반환
				InetAddress[] inetAddresses = InetAddress.getAllByName(line);
				for (InetAddress inetAddress : inetAddresses) {
					System.out.println(line + " : " + inetAddress.getHostAddress());
				}
			} catch (UnknownHostException ex) {
				System.out.println(line + " : 알려진 호스트가 없습니다.");
			}
		}

		scanner.close();
	}

	public static String inputDNS(Scanner scanner) {
		System.out.print("> ");
		String line = scanner.nextLine();

		return line;
	}

}
