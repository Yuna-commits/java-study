package chapter04.object;

public class Goods {
	private String name;
	protected int price;
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

	// 기본 1개 판매
	public void sell() {
//		if (countStock > 0) {
//			countStock--;
//			countSold++;
//		}
		sell(1);
	}

	public void sell(int quantity) {
		if(quantity<0) {
			System.out.println("입력 오류");
			return;
		}
		if (countStock >= quantity) {
			countStock -= quantity;
			countSold += quantity;
		} else {
			System.out.println("재고 부족");
		}

	}

	public void showInfo() {
		System.out.println("상품 이름: " + name + ", 가격: " + price + ", 재고량: " + countStock + ", 판매량: " + countSold);
	}

	public void showInfo(boolean summary) {
		if (summary) {
			System.out.println("상품 이름: " + name + ", 가격: " + price);
		} else {
			showInfo();
		}
	}
}
