package chapter03.paint;

import java.io.Serializable;

public class Paint {
	public static void main(String[] args) {
		Canvas canvas = new Canvas();

		Point point1 = new Point();
		point1.setX(10);
		point1.setY(20);

		canvas.draw(point1);
		point1.show(false);

		// point1.disappear();
		Point point2 = new Point(100, 200);
		canvas.draw(point2);

		ColorPoint point3 = new ColorPoint(50, 60, "red");

		// ColorPoint -> Point -> ColorPoint로 캐스팅
		canvas.draw(point3);

		canvas.draw(new Triangle());
		canvas.draw(new Rectangle());
		canvas.draw(new Circle());

		canvas.draw(new GraphicText("Hello World!"));

		/* instanceof 연산자 */

		Circle c = new Circle();
		System.out.println(c instanceof Object);// true
		System.out.println(c instanceof Shape);// true
		System.out.println(c instanceof Circle);// true

		// error, 컴파일 타임에 타입 검사도 하기 때문에 상속 계층 관계가 전혀 없으면 오류
		// System.out.println(c instanceof Point);

		// 다운캐스팅 전에 타입 검사
		Object o = new Circle();
		//o instanceof Circle -> true
		if (o instanceof String) {//false
			String s = (String) o;
		}
		
		//우측항이 인터페이스인 경우
		//상속 hierachy에 상관없이 사용 가능
		System.out.println(c instanceof Drawable);//true
		System.out.println(c instanceof Serializable);//false
	}
}
