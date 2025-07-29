package generic;

public class PairTest {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<String, Integer>("One", 1);

		System.out.println("key: " + pair.getKey());
		System.out.println("value: " + pair.getValue());
	}

}
