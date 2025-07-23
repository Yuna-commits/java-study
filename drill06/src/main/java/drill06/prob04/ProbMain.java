package drill06.prob04;

import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		Car[] cars = new Car[3];

		Scanner scanner = new Scanner(System.in);

		String model = null;
		int speed = 0;

		/* 코드 작성 */
		for (int i = 0; i < cars.length; i++) {
			System.out.print("자동차" + (i + 1) + ": ");
			model = scanner.next();
			speed = scanner.nextInt();

			cars[i] = new Car(model, speed);
		}

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		scanner.close();
	}

}
