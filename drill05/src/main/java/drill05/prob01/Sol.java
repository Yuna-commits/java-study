package drill05.prob01;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.print("배열 요소: ");

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		scanner.close();
	}
}
