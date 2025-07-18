package drill05.prob07;

import java.util.Scanner;

public class Sol {
	
	public static int getIndex(int[] num, int target) {
		for (int i = 0; i < num.length; i++) {
			if (target == num[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		int[] numbers = new int[5];

		System.out.print("배열: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.print("찾을 값: ");
		int target = scanner.nextInt();

		System.out.println(target + "는(은) 인덱스 " + getIndex(numbers, target) + "에 있음");
		scanner.close();
	}

}
