package chapter04.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("panchu.png");
			os = new FileOutputStream("panchu(1).png");

			int data = -1;
			// 1byte씩 읽기, 더 읽을게 없으면 -1
			while ((data = is.read()) != -1) {
				os.write(data); // 매개값 int의 끝 1byte 쓰기
			}
		} catch (FileNotFoundException e) {// 파일이 존재하지 않는 경우
			System.out.println("file not found: " + e);
		} catch (IOException e) {
			System.out.println("error: " + e);
		} finally {// 명시적 자원정리
			try {
				if (is != null) {
					is.close();
				}
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {// close()의 IOException
				e.printStackTrace();
			}
		}
	}

}
