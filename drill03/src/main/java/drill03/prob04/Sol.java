package drill03.prob04;

/**
 * 
 * 문제 4. 세 수 중 최댓값 구하기
 * 
 * 변수 x, y, z 중 가장 큰 값을 출력하세요.
 * 
 * 
 */

public class Sol {

	public static void main(String[] args) {
		int x = 30, y = 22, z = 18;
//		int max=x;
//		if(max<y) {
//			max=y;
//		}
//		if(max<z) {
//			max=z;
//		}
		// 조건문을 활용해 최댓값 출력
		int tmp = x > y ? x : y;
		System.out.println("max: " + (tmp > z ? tmp : z));
	}

}
