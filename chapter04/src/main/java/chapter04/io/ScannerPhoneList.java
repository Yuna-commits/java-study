package chapter04.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScannerPhoneList {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			File file = new File("phone.txt");

			if (!file.exists()) {
				System.out.println("file not found");
				return;
			}

			System.out.println("========== 파일 정보 ==========");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "Bytes");

			long lastModified = file.lastModified();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(sdf.format(new Date(lastModified)));

			System.out.println("========== 전화번호 ==========");

			sc = new Scanner(file);

			while (sc.hasNextLine()) {
				String name = sc.next();
				String phone1 = sc.next();
				String phone2 = sc.next();
				String phone3 = sc.next();

				System.out.println(name + " : " + phone1 + "-" + phone2 + "-" + phone3);
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found: " + e);
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
