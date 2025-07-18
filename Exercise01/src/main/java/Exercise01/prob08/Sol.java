package Exercise01.prob08;

import java.util.Scanner;

/**
 * 키보드로 부터 돈의 액수인 양의 정수를 입력 받아 50,000원 권, 10,000원 권, 5,000원 권, 1,000원 권, 500원
 * 동전, 100원 동전, 50원 동전, 10원 동전, 1원 동전으로 변환 되는 프로그램을 작성합니다.
 * 
 * 화폐 단위 목록 (고액권 → 저액권 순서):
 */

public class Sol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] moneyCnt = new int[MONEYS.length];

		System.out.print("입력: ");
		int input = sc.nextInt();

		for (int i = 0; i < MONEYS.length; i++) {
			moneyCnt[i] = input / MONEYS[i];
			input %= MONEYS[i];
		}

		for (int i = 0; i < MONEYS.length; i++) {
			System.out.println(MONEYS[i] + "원: " + moneyCnt[i] + "개");
		}
	}
}
