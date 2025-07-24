package exercise03.prob05;

public class Account {
	private String accountNo; // 계좌번호
	private int balance; // 잔고

	private enum AccountStatus {
		DEPOSITED, // 입금
		WITHDRAWN // 출금
	}

	public Account(String accountNo) {
		this.accountNo = accountNo;
		this.balance = 0;

		// 계좌 개설 메시지 출력
		showMessage();
	}

	public String getAccountNo() {
		return accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		if (isInvalidAmount(amount)) {
			System.out.println("입력 오류");
			return;
		}

		balance += amount;

		// 입금 완료 메시지
		showMessage(AccountStatus.DEPOSITED, amount);
	}

	public void withdraw(int amount) {
		if (isInvalidAmount(amount)) {
			System.out.println("입력 오류");
			return;
		}

		if (amount > balance) {
			System.out.println("잔액 부족");
			return;
		}

		balance -= amount;

		// 출금 완료 메시지
		showMessage(AccountStatus.WITHDRAWN, amount);
	}

	public boolean isInvalidAmount(int amount) {
		return (amount < 0);
	}

	public void showMessage() {
		System.out.println(accountNo + " 계좌가 개설 되었습니다.");
	}

	public void showMessage(AccountStatus status, int amount) {
		switch (status) {
		case DEPOSITED:
			System.out.println(accountNo + "계좌에 " + amount + "만원이 입금 되었습니다.");
			break;
		case WITHDRAWN:
			System.out.println(accountNo + " 계좌에 " + amount + "만원이 출금 되었습니다.");
			break;
		}
	}
}
