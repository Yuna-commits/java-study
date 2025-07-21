package exercise01.prob09;

/**
 * 문자 배열(char[])의 공백을 모두 -로 바꾸어 출력하고 바뀐 공백의 개수를 함께 출력하세요.
 */

public class Sol {
	public static void main(String[] args) {
		char text[] = { 'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 
				'n', ' ', 't', 'o', ' ', 'l', 'e', 'a', 'r','n' };
		int cnt = 0;

		for (int i = 0; i < text.length; i++) {
			if (text[i] == ' ') {
				text[i] = '-';
				cnt++;
			}
		}
		
		System.out.print("변환: ");
		for (char c : text) {
			System.out.print(c);
		}
		
		System.out.println("\n바뀐 공백 수: " + cnt);
	}
}
