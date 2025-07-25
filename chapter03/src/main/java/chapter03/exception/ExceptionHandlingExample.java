package chapter03.exception;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int a = 10;
		int b = a - 10;

		System.out.println("some code 1...");
		try {
			System.out.println("some code 2...");
			/* 예외 발생 */
			int result = (1 + 2 + 3) / b;
			/* 실행 x */
			System.out.println("some code 3...");
		} catch (ArithmeticException e) {
			/* 예외 처리 */
			// 1. 사과
			System.out.println("미안합니다.");
			
			// 2. 로그
			//System.out.println("error: " + e);
			e.printStackTrace();
			
			// 3. 정상종료
			//System.exit(0);
			return;

			// System.out.println("some code 4...");
			// e.printStackTrace();
		} finally {
			//자원 정리: close file, socket, db connection
			/* 항상 실행 */
			System.out.println("some code 5...");
		}
		/* 항상 실행 */
		System.out.println("some code 6...");
	}

}
