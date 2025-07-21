package exercise02.prob02;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		System.out.print("입력: ");
		/* 코드 작성 */
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
			if (max < numbers[i])
				max = numbers[i];
			if (min > numbers[i])
				min = numbers[i];
		}

		System.out.println("최대-최소 차이: " + (max - min));

		scanner.close();
	}

}
