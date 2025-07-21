package chapter03.ex02.app;

import chapter03.ex02.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();

		// public 은 접근 제한이 없음
		camera.name = "nikon";

		// protected 는 같은 패키지에서만 접근 가능
		// 또는 상속 관계 자식에서 접근 가능
		// camera.price = 40000;

		// 디폴트는 같은 패키지에서만 접근 가능
		// camera.countStock = 20;

		// private 은 내부에서만 접근 가능
		// camera.countSold=10;
	}

}
