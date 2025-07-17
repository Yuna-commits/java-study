package ch01;

public class Ex27InfiniteLoop {
	public static void main(String[] args) {
		for (int i = 1;; i++) {
			System.out.println("i: " + i);
			if (i == 10)
				break;
		}
	}
}
