package network.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHost {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();

			String hostName = inetAddress.getHostName();
			String hostIpAddress = inetAddress.getHostAddress();

			System.out.println(hostName);
			System.out.println(hostIpAddress);

			byte[] IpAddresses = inetAddress.getAddress();// 4byte 주소
			for (byte IpAddress : IpAddresses) {
				System.out.println(IpAddress&0x000000ff);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
