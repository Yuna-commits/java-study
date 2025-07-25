package chapter04.object;

public class ObjectMethodExample01 {

	public static void main(String[] args) {
		Goods goods = new Goods();

		Class klass = goods.getClass();// reflection
		System.out.println(klass.getName());// chapter04.object.Goods

		System.out.println(goods.hashCode());// address 기반의 해싱값
		
		//chapter04.object.Goods@54bedef2
		//getClass().getName() + "@" + Integer.toHexString(hashCode())
		System.out.println(goods.toString()); 
		System.out.println(goods);
		
	}

}
