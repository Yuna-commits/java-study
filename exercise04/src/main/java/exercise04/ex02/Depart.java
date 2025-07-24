package exercise04.ex02;

public class Depart extends Employee {
	private String department;

	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	@Override
	public void printInformation() {
		super.printInformation();
		System.out.print(" 부서: " + department);
	}
}
