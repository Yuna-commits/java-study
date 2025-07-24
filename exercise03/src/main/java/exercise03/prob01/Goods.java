package exercise03.prob01;

public class Goods {
	private String name;
	private int price, stock;

	public Goods(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	// 상품정보 출력
	public void printInfo() {
		System.out.println(name + "(가격:" + price + "원)이 " + stock + "개 입고 되었습니다.");
	}
}