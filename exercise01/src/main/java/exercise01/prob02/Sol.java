package exercise01.prob02;

import java.util.Scanner;

/**
 * 정수 n을 입력받아 A~Z 중 앞에서 n개 출력
 */

public class Sol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수[1 - ]: ");
		int num = sc.nextInt();
		char ch = 'A';

		while (num > 0) {
			System.out.print((ch++) + " ");
			num--;
		}
		
		sc.close();
	}
}
