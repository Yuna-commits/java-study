package drill05.prob09;

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

		int tmp = numbers[0];
		numbers[0] = numbers[len - 1];
		numbers[len - 1] = tmp;

		System.out.println("교환 후: " + Arrays.toString(numbers));
		scanner.close();
	}

}
