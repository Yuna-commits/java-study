package ch01;

/**
 * 0 ~ 100 사이의 점수가 있을 때,
 * 90 이상이면 A,
 * 90 미만 80 이상이면 B,
 * 80 미만 70 이상이면 C,
 * 70 미만 60 이상이면 D,
 * 60 미만은 F
 * 를 판별하는 로직(알고리즘)
 */
public class Ex14IfElseIfElseExample {
	public static char getScore(int score) {
		if (score >= 90) {
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 70) {
			return 'C';
		} else if (score >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}

	public static void main(String[] args) {
		int score = 70;

		System.out.println(getScore(score));
	}

}
