package drill02.prob06;

/**
 * 
 * 문제 6: 변수 타입 오류 찾기
 * 
 * 문제: 오류 발생 줄에 그 이유를 주석으로 달고 바르게 고쳐 컴파일 및 실행하기
 * 
 */
public class Sol {

	public static void main(String[] args) {
		char a = '안';
		System.out.println(a);
		// int count = "three";
		String count = "three";
		boolean isOn = true;
		char c = 'A';
		float f = 3.14f;
		String name = "Alice";

		System.out.println(count);
		System.out.println(isOn);
		System.out.println(c);
		System.out.println(f);
		System.out.println(name);
	}

}
