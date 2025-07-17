package drill04.prob04;

/**
 * 
 * 문제 4. 누적 합 계산 - for 사용
 * 
 * for문을 사용하여 1부터 100까지의 합을 계산하고 출력하세요.
 * 
 * 
 */

public class Sol {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum: " + sum);
	}

}
