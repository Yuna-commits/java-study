package chapter03.ex10;

public class SwapTest01 {

	public static void main(String[] args) {
		int i = 10, j = 20;

		System.out.println(i + ", " + j);

		// swap
		int tmp = i;
		i = j;
		j = tmp;

		System.out.println(i + ", " + j);
	}

}
