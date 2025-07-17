package Exercise01.prob07;

/**
 * 아래와 같은 출력 결과를 만드는 프로그램을 작성하세요.
 * 
 * 가로는 1부터 시작하여 오른쪽으로 증가하고,
 * 
 * 세로는 한 줄마다 시작 숫자가 1씩 증가하며 줄 수가 1씩 늘어납니다
 */

public class Sol {
	public static void main(String[] args) {
		for (int dan = 1; dan < 10; dan++) {
			for (int num = dan, cnt = 0; cnt < 10; num++, cnt++) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
