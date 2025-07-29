package generic;

public class Box02Test {

	public static void main(String[] args) {
		Box02 objectBox = new Box02("10");

		System.out.println(objectBox.getValue());

		Integer value = (Integer) objectBox.getValue();
		System.out.print(value);
	}

}
