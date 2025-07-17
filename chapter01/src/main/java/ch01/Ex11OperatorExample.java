package ch01;

public class Ex11OperatorExample {

	public static void main(String[] args) {
		int radius = 5;

		System.out.println("반지름: " + radius);
		System.out.println("원의 넓이: " + calculateCircleArea(radius));
	}

	public static double calculateCircleArea(int radius) {
		final double PI = 3.14;
		return (PI * radius * radius);
	}
}
