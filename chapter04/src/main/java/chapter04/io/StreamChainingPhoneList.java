package chapter04.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class StreamChainingPhoneList {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			File file = new File("phone.txt");

//			if (!file.exists()) {
//				System.out.println("file not found");
//				return;
//			}

			System.out.println("========== 파일 정보 ==========");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "Bytes");

			long lastModified = file.lastModified();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(sdf.format(new Date(lastModified)));

			System.out.println("========== 전화번호 ==========");

			// Stream Chaining
			// 1.기반 스트림
			FileInputStream fis = new FileInputStream(file);

			// 2.보조 스트림 1: (byte|byte|byte -> char) -> 보조 스트림 2
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");

			// 3. 보조 스트림 2: (char1|char2|char3|char4|\n -> "char1char2char3char4")
			br = new BufferedReader(isr);

			// 4. 처리(형식 변경)
			String line = null;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t ");

				int index = 0;
				while (st.hasMoreElements()) {
					String token = st.nextToken();
					System.out.print(token);
					if (index == 0) {// 이름
						System.out.print(" 	: ");
					} else if (index == 1 || index == 2) {// 전화번호 1
						System.out.print(" - ");
					} else {
						System.out.print("\n");
					}

					index++;
				}
			}
		} catch (UnsupportedEncodingException e) {// 인코딩 방식 exception
			System.out.println("error: " + e);
		} catch (IOException e) {
			System.out.println("error: " + e);
		} finally {// 명시적 자원정리
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {// close()의 IOException
				e.printStackTrace();
			}
		}
	}

}
