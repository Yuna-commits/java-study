package drill06.prob09;

public class Account {
	private String owner;
	private int balance;

	public String getOwner() {
		return owner;
	}

	public void setOwner() {
		this.owner = new String("User");
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 출금
	public int withdraw(int amount) {
		boolean flag = false;

		if (balance > amount) {
			flag = true;
			balance -= amount;
		}
		
		System.out.println("출금: " + (flag ? amount + "원" : "잔액부족"));
		System.out.println("잔액: " + balance + "원");

		return amount;
	}
}
