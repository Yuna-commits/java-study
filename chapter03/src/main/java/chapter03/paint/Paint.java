package chapter03.paint;

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
	}
}
