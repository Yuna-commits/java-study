package drill05.prob05;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		System.out.println("int의 최소값: " + Integer.MIN_VALUE);

		int[] numbers = new int[5];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}

		System.out.println("최댓값: "+max);
		
		scanner.close();
	}

}
