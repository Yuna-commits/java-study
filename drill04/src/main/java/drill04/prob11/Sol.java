package drill04.prob11;

/**
 * 
 * 문제 11. 중첩 반복문을 이용한 구구단 전체 출력
 * 
 * 중첩된 반복문을 사용하여 다음과 같은 형식으로 구구단 전체(1단 ~ 9단)를 출력하는 프로그램을 작성하세요.
 * 출력은 세로로 단이 증가하고
 * 가로로 곱하는 수(1~9)가 증가해야 합니다.
 * 
 */

public class Sol {

	public static void main(String[] args) {
		for (int plier = 1; plier < 10; plier++) {// 승수
			for (int plicand = 1; plicand < 10; plicand++) {// 피승수
				System.out.print(plicand + " x " + plier + " = " + (plicand * plier) + "\t");
			}
			System.out.println();
		}
	}

}
