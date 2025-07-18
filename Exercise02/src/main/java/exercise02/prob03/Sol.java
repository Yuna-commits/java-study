package exercise02.prob03;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수[1 - ]: ");

		/* 코드 작성 */
		int num = scanner.nextInt();
		int sum = 0, start;

		if (num % 2 == 0) {// 짝수인 경우
			start = 0;
		} else {
			start = 1;
		}

		for (int i = start; i <= num; i += 2) {
			sum += i;
		}

		System.out.println("결과값: " + sum);

		scanner.close();
	}

}
