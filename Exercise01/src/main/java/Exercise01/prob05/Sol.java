package Exercise01.prob05;

import java.util.Scanner;

/**
 * 정수 하나를 입력받아 각 자리 숫자의 합을 구하시오.
 * 
 * (예: `123 → 1 + 2 + 3 = 6`)
 */

public class Sol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수[1 - ]: ");
		int num = sc.nextInt();

		int sum = 0;

		while(num>0) {
			sum+=(num%10);
			num/=10;
		}
		
//		String str = String.valueOf(num);
//
//		for (int i = 0; i < str.length(); i++) {
//			sum += (str.charAt(i)) - '0';
//		}

		System.out.println("자릿수 합: " + sum);
	}
}
