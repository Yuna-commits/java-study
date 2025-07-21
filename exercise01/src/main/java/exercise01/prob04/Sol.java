package exercise01.prob04;

import java.util.Scanner;

/**
 * 한 문자를 입력받아 알파벳인지 여부를 판별하시오.
 * 
 * (힌트: `'a'~'z'` 또는 `'A'~'Z'` 범위 확인)
 */

public class Sol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자: ");
		char c = sc.next().charAt(0);

		if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')) {
			System.out.println("알파벳입니다.");
		} else {
			System.out.println("알파벳이 아닙니다.");
		}
		
		sc.close();
	}

}
