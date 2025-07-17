package Exercise01.prob03;

/**
 * 1~100까지 중 5의 배수 개수 출력
 */

public class Sol {
	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				cnt++;
			}
		}
		System.out.println("5의 배수 개수: " + cnt);
	}
}