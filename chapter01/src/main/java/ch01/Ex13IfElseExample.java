package ch01;

/**
 * 0을 포함한 양수의 값이 있을 때,
 * 짝수인지 홀수인지 판별하는 로직
 */
public class Ex13IfElseExample {

	public static void main(String[] args) {
		int number = 7;
		
		if (number % 2 != 0) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
	}

}
