package ch01;

/**
 * 0~100 사이의 점수가 있을 때,
 * 80점 이상이면 합격을 판별하는 로직
 */
public class Ex12IfExample {
	public static void main(String[] args) {
		int score = 89;
		if (score >= 80) {
			System.out.println("합격");
		}
	}
}
