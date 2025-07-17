package ch01;

public class Ex18WhileLoop {
	public static void main(String[] args) {
		int num = 0;
		while (num < 10) {
			System.out.println(++num);
		}
		System.out.println("Out of Loop");
	}
}