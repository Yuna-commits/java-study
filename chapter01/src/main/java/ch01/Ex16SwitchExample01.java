package ch01;

public class Ex16SwitchExample01 {

	public static void main(String[] args) {
		char grade = 'S';
		switch (grade) {
		case 'A':
		case 'B':
			System.out.println("잘했습니다.");
			break;
		case 'C':
		case 'D':
			System.out.println("노력했습니다.");
			break;
		case 'F':
			System.out.println("다음 학기에 수강하세요.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}

}
