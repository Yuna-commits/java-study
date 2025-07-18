package drill05.prob06;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		System.out.println("int의 최대값: " + Integer.MAX_VALUE);
		
		int[] numbers = new int[5];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}

		System.out.println("최솟값: "+min);
		
		scanner.close();
	}

}
