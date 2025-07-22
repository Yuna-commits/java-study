package chapter03.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();

		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountSold(10);
		camera.setCountStock(20);

		camera.showInfo();

		System.out.println(
				"상품 이름: " + camera.getName() + 
				", 가격: " + camera.getPrice() +
				", 재고량: " + camera.getCountStock() + 
				", 판매량: " + camera.getCountSold());
		
		System.out.println(camera.calcDiscountPrice(0.5f));
	}

}
