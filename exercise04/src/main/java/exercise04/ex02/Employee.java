package exercise04.ex02;

public class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void printInformation() {
		System.out.print("이름: " + name + "  연봉: " + salary);
	}
}
