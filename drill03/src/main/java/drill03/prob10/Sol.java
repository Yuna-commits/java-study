package drill03.prob10;

/**
 * 
 * 문제 10. switch 문 – 간단 계산기
 * 
 * num1, num2, op를 이용하여 사칙연산(+, -, *, /) 결과를 출력하는 switch문을 작성 (예: op = '+'이면 덧셈
 * 수행)
 * 
 */
public class Sol {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		char op = '*';

		// 여기에 switch문 작성
		switch (op) {
		case '+':
			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			break;
		case '-':
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			break;
		case '*':
			System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			break;
		case '/':
			System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			break;
		}
	}

}
