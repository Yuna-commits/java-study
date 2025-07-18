package drill05.prob08;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		int[] numbers = new int[5];
		int[] notDuplicate = new int[5];// 중복x 배열
		int idx = 0;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		// 중복이 아닌 것만 배열에 저장
		// notDuplicate에 이미 있는 값이면 중복
		for (int i = 0; i < numbers.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < idx; j++) {
				if (numbers[i] == notDuplicate[j]) {
					isDuplicate = true;
					break;
				}
			}
			// 중복x
			if (!isDuplicate) {
				notDuplicate[idx++] = numbers[i];
			}
		}

		System.out.print("중복 제거 후: ");
		for (int i = 0; i < idx; i++) {
			System.out.print(notDuplicate[i] + " ");
		}

		scanner.close();
	}

}
