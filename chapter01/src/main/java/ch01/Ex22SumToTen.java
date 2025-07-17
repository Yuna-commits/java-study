package ch01;

public class Ex22SumToTen {
	public static void main(String[] args) {
		int sum = 0, num = 1;

		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1 ~ 10 Sum: " + sum);
	}
}
