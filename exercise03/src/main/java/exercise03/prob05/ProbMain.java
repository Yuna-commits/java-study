package exercise03.prob05;

public class ProbMain {
	public static void main(String[] args) {
		
		Account account = new Account("078-3762-293");
		System.out.println(account.getAccountNo() + " 계좌의 잔고는 " + account.getBalance() + "만원 입니다.");
		
		account.deposit(100);
		System.out.println(account.getAccountNo() + " 계좌의 잔고는 " + account.getBalance() + "만원 입니다.");

		account.withdraw(30);
		System.out.println(account.getAccountNo() + " 계좌의 잔고는 " + account.getBalance() + "만원 입니다.");
	}
}