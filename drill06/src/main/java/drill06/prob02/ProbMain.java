package drill06.prob02;

import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("제목: ");
		String title = scanner.nextLine();
		System.out.print("가격: ");
		int price = scanner.nextInt();
		scanner.close();

		/* 코드 작성 */
		Book book = new Book(title, price);
		System.out.println(book);
	}

}
