package chapter03.ex03;

public class Goods {
	private static int countOfGoods;

	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public static int getCountOfGoods() {
		return countOfGoods;
	}

	public Goods() {
		// 클래스 내부에서는 클래스 이름 생략이 가능
		// Goods.countOfGoods++; //(원칙)
		
		countOfGoods++;
	}
}
