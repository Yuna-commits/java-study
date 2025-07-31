package chapter04.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// 기반 스트림
			// FileReader fr = new
			// FileReader("./src/main/java/chapter04/io/BufferedReaderExample.java");

			// 보조 스트림
			// br = new BufferedReader(fr);

			// StreamChainingKeyboard와 같은 방식 -> 보조2(보조1(기반), 인코딩 방식) ==> 프로그램(콘솔)
			br = new BufferedReader(new InputStreamReader(
					new FileInputStream("./src/main/java/chapter04/io/BufferedReaderExample.java"), "utf-8"));

			// buffer에 문자를 읽어서 넣음 -> 개행이 들어오면 그 앞의 문자들을 String으로 반환
			String line = null;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("file not found: " + e);
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
