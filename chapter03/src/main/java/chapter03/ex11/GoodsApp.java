package chapter03.ex11;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();

		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountSold(10);
		camera.setCountStock(20);
		camera.showInfo();

		Goods tv = new Goods("TV",	200000, 100, 200);

		tv.showInfo();
	}

}
