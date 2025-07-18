package drill05.prob04;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		int[] numbers = new int[4];
		double total = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
			total+=numbers[i];
		}
		
		System.out.println("평균: "+total/(numbers.length));

		scanner.close();
	}

}
