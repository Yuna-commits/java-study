package ch01;

public class Ex31ArrayExample {
	public static void main(String[] args) {
		int[] arr1 = null;
		int[] arr2 = new int[3];

		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;

		// 선언 + 생성 + 초기화
		int[] arr3 = { 10, 20, 30 };
		int[] arr4 = new int[] { 10, 20, 30, };

		System.out.println(arr2[0]);
		System.out.println(arr3[1]);
		System.out.println(arr4[2]);

		System.out.println(arr4.length);// 배열 객체의 속성 length

		// ArrayIndexOutOfBoundsException
		// System.out.println(arr2[3]);
	}
}
