package chapter03.exception;

import java.io.IOException;

public class DangerousClassTest {

	public static void main(String[] args) {
		DangerousClass dc = new DangerousClass();
		try {
			dc.danger();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
