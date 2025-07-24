package chapter03.ex15;

import chapter03.ex14.Goods;

public class DiscountGoods extends Goods {
//	public DiscountGoods() {
//		super("", 10, 10, 10);
//	}

	public int calcDiscountPrice(float rate) {
		// return (int)(getPrice() * rate);
		return (int) (price * rate);
	}
}
