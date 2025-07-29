package generic;

public class Box01Test {

	public static void main(String[] args) {
		Box01 stringBox = new Box01("hello");
		
		System.out.println(stringBox.getValue());
		
		stringBox.setValue(" ");
		System.out.println(stringBox.getValue());
		
		stringBox.setValue("world");
		System.out.println(stringBox.getValue());
	}

}
