package exercise02.prob05;

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
			System.out.print(i + " ");
			
			if (tmp.contains("3") || tmp.contains("6") || tmp.contains("9")) {
				for (int j = 0; j < getCount(tmp); j++) {
					System.out.print("짝");
				}
			}
			
			System.out.println();
		}

	}

}
