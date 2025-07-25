package chapter03.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		// FileNotFoundException 던짐
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("hello.txt");
			int data = fis.read();
			System.out.println((char)data);
		} catch (FileNotFoundException e) {
//			System.out.println("error: " + e);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("error: " + e);
		} finally {
			try {
				if(fis!=null) {
					fis.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
