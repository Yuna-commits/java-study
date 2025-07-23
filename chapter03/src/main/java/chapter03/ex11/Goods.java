package chapter03.ex11;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public Goods() {
		
	}
	
	public Goods(String name, int price, int countStock, int countSold) {
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public int calcDiscountPrice(float percentage) {
		return (price - (int) (price * percentage));
	}

	public void showInfo() {
		System.out.println("상품 이름: " + name + ", 가격: " + price + ", 재고량: " + countStock + ", 판매량: " + countSold);
	}
}
