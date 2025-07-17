package Exercise01.prob10;

/**
 * 1부터 100까지의 숫자를 순차적으로 확인하면서, 숫자에 **3, 6, 9** 중 하나라도 포함되어 있다면 `"짝"`을 출력합니다.
 * 
 * - **3, 6, 9가 한 번 들어있으면**: `"짝"` 출력 
 * 
 * - **두 번 들어있으면**: `"짝짝"` 출력 
 * 
 * - **없으면**: 해당 숫자만 출력
 */

public class Sol {
	public static int getCount(String tmp) {
		int cnt = 0;

		for (char c : tmp.toCharArray()) {// 3, 6, 9 개수
			if (c == '3' || c == '6' || c == '9') {
				cnt++;
			}
		}

		return cnt;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			String tmp = String.valueOf(i);
			if (tmp.contains("3") || tmp.contains("6") || tmp.contains("9")) {
				System.out.print(i + " ");
				for (int j = 0; j < getCount(tmp); j++) {
					System.out.print("짝");
				}
				System.out.println();
			} else {
				System.out.println(i);
			}
		}
	}

}
