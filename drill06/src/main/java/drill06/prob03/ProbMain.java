package drill06.prob03;

import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name = null;
		int score = 0;
		Student stu1 = new Student();
		Student stu2 = new Student();

		// 학생1
		System.out.print("학생1: ");
		name = scanner.next();
		score = scanner.nextInt();
		stu1.setName(name);
		stu1.setScore(score);

		// 학생2
		System.out.print("학생2: ");
		name = scanner.next();
		score = scanner.nextInt();
		stu2.setName(name);
		stu2.setScore(score);

		int comparison = stu1.compareTo(stu2);
		
		if (comparison > 0) {
			System.out.println(stu1.getName() + "의 점수가 더 높습니다.");
		} else if (comparison < 0) {
			System.out.println(stu2.getName() + "의 점수가 더 높습니다.");
		} else {
			System.out.println("두 학생의 점수는 같습니다.");
		}

		scanner.close();
	}

}
