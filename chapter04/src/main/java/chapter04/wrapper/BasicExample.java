package chapter04.wrapper;

public class BasicExample {

	public static void main(String[] args) {
		// 직접 생성하면 Heap에 객체가 존재한다
		// 리터럴을 사용하면 JVM 안에 Constant Pool(상수풀)에서 관리한다.
		Integer i = new Integer(10); // deprecated
		Integer j1 = 10; // auto boxing
		Integer j2 = 10;

		System.out.println(j1 == j2);
		System.out.println(j1.equals(j2));

		int m = j1 + 10; // auto unboxing
	}

}
