package ch01;

public class Ex19PowerOfTwo {
	public static void main(String[] args) {
		int i = 0;
		int result = 1;

		while (i < 10) {
			result *= 2;
			i++;
		}
		
		System.out.println("2^10 Result: " + result);
	}
}
