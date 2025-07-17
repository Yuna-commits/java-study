package Exercise01.prob01;

import java.util.Scanner;

/**
 * 정수 하나를 입력받아 절댓값을 출력하시오.
 */

public class Sol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		if (num < 0) {
			num *= -1;
		}
		System.out.println("절댓값: " + num);
		// System.out.println("Abs: " + Math.abs(num));
	}
}
