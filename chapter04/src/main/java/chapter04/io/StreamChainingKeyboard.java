package chapter04.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/*
 * 개행 단위로 키보드 입력을 콘솔에 출력
 */
public class StreamChainingKeyboard {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// 1. 기반 스트림(표준 입력, stdin, System.in)

			// 2. 보조 스트림 1(byte|byte|byte -> char) : Encoding
			InputStreamReader isr = new InputStreamReader(System.in, "utf-8");

			// 3. 보조 스트림 2(char1|char2|char3|char4|\n -> "char1char2char3char4")
			br = new BufferedReader(isr);

			// 4. 처리
			String line = null;
			while ((line = br.readLine()) != null) {
				if ("quit".equals(line)) {
					break;
				}

				System.out.println(line);
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
