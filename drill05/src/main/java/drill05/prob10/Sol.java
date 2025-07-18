package drill05.prob10;

import java.util.Arrays;
import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		int len = numbers.length;

		/* 코드 작성 */
		for (int i = 0; i < len; i++) {
			numbers[i] = scanner.nextInt();
		}

		for (int i = 0; i <= len / 2; i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[len - i - 1];
			numbers[len - i - 1] = tmp;
		}

		System.out.println(Arrays.toString(numbers));
		scanner.close();
	}

}
