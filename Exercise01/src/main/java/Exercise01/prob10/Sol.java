package Exercise01.prob10;

import java.util.Arrays;

/**
 * 버블 정렬 알고리즘을 구현하여 정수를 내림차순으로 정렬하시오 다음과 같은 정수 배열이 주어졌을 때, 버블 정렬 알고리즘을 사용하여 배열을
 * 내림차순 으로 정렬하는 프로그램을 작성하시오.
 */

public class Sol {
	
	public static void main(String[] args) {
		int data[] = { 5, 9, 3, 8, 60, 20, 1 };

		System.out.println("초기값\n" + Arrays.toString(data) + "\n");

		for (int i = 0; i < data.length - 1; i++) {
			System.out.println(i + 1 + "회" + (i + 1 == data.length - 1 ? ": 마지막" : ""));
			
			for (int j = 0; j < data.length - i - 1; j++) {
				boolean flag = false;

				if (data[j] < data[j + 1]) {
					int tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
					flag = true;
				}

				System.out.println(
						Arrays.toString(data) + ": " + data[j] + ", " + data[j + 1] + 
						(flag ? " 바꾼다" : " 제자리"));
			}
		}
	}

}
