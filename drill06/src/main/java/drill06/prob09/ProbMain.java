package drill06.prob09;

import java.util.Scanner;

public class ProbMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Account account = new Account();
		account.setOwner();
		account.setBalance(50000);
		
		System.out.print("출금액: ");
		int amount = scanner.nextInt();
		account.withdraw(amount);

		System.out.print("출금액: ");
		amount = scanner.nextInt();
		account.withdraw(amount);

		scanner.close();
	}

}
