package chapter04.wrapper;

public class ConstantPool {

	public static void main(String[] args) {
		Integer a = 100;
		Integer b = 100;
		System.out.println(a == b); // true (같은 객체)

		Integer x = 200;
		Integer y = 200;
		System.out.println(x == y); // false (다른 객체)
		System.out.println(x.equals(y)); // true
	}

}
