package Exercise01.prob06;

import java.util.Scanner;

/**
 * 정수 n을 입력받아 완전수(perfect number)인지 판별하시오.
 * 
 * (자기 자신을 제외한 약수의 합이 자기 자신과 같으면 완전수)
 */

public class Sol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수[2 - ]: ");
		int num = sc.nextInt();
		int result = 0;

		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				result += i;
			}
		}

		System.out.println(num + "는(은) " + ((num == result) ? "완전수입니다." : "완전수가 아닙니다."));
		
		sc.close();
	}
}
