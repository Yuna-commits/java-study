package network.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHost {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();

			String localhostName = inetAddress.getHostName();
			String localhosthostIpAddress = inetAddress.getHostAddress();

			System.out.println(localhostName);
			System.out.println(localhosthostIpAddress);

			byte[] IpAddresses = inetAddress.getAddress();// 4byte 주소
			for (byte IpAddress : IpAddresses) {
				System.out.println(IpAddress&0x000000ff);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
