package drill06.prob08;

import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		final int STUDENT = 5;
		Score[] scores = new Score[STUDENT];

		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		for (int i = 0; i < STUDENT; i++) {
			System.out.print("점수 " + (i + 1) + ": ");
			int input = scanner.nextInt();
			scores[i] = new Score(input);
		}

		int sum = 0;
		for (Score score : scores) {
			sum += score.getValue();
		}

		System.out.println("평균 점수: " + (double) sum / STUDENT);

		scanner.close();
	}

}
