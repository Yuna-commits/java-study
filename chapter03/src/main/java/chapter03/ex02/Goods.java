package chapter03.ex02;

public class Goods {
	public String name; // 모든 접근 가능(접근 제한 x)
	protected int price; // 같은 패키지 + 자식 클래스의 접근 가능
	int countStock; // 같은 패키지 접근 가능(디폴트)
	private int countSold;// 클래스 내부에서만 접근 가능

	public void m() {
		countSold = 0;
	}
}
