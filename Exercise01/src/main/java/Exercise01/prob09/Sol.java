package Exercise01.prob09;

import java.util.Scanner;

/**
 * 문자열을 입력 받아 다음과 같은 출력 결과가 되도록 하세요.
 * 
 * 사용자로부터 문자열을 입력받아, 해당 문자열을 **앞에서부터 한 글자씩 누적하여 출력**하는 프로그램을 작성하시오.
 * 
 * 예를 들어 입력이 `"Bat Man"`이라면, 아래와 같은 결과가 출력되어야 합니다.
 */

public class Sol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열: ");
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
}
