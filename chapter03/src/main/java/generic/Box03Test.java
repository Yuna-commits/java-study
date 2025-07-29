package generic;

public class Box03Test {

	public static void main(String[] args) {
		Box03<String> genericBox = new Box03<String>("10");

		System.out.println(genericBox.getValue());

		// 컴파일 오류!
		// Integer value = genericBox.getValue();
		String value = genericBox.getValue();
		System.out.print(value);
	}

}
