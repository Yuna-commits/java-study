package generic;

public class Printer03 {
	public int sum(int... numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}

	public <T> void println(T... ts) {
		for (T t : ts) {
			System.out.print(t + " ");
		}
		System.out.println();
	}
}
