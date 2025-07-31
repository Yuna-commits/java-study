package chapter04.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOuputStreamExample {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		try {
			// 기반 스트림(Base Stream)
			FileOutputStream fos = new FileOutputStream("hello.txt");

			// 보조 스트림(Decorator Stream)
			// Stream Chaining
			bos = new BufferedOutputStream(fos);

			for (int i = 'a'; i <= 'z'; i++) {
				bos.write(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found: " + e);
		} catch (IOException e) {
			System.out.println("error: " + e);
		} finally {// 명시적 자원정리
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {// close()의 IOException
				e.printStackTrace();
			}
		}
	}

}
