package exercise02.prob04;

import java.util.Scanner;

public class Sol {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열: ");
		String text = scanner.nextLine();
		scanner.close();

		/* 코드 작성 */
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(text.charAt(j));
			}
			System.out.println();
		}
	}

}
