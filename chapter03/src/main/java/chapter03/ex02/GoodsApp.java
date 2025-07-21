package chapter03.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.name = "nikon";
		camera.price = 40000;
		camera.countStock = 20;

		// private 은 내부에서만 접근 가능
		// camera.countSold=10;
	}

}
