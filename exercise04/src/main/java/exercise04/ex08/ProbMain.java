package exercise04.ex08;

public class ProbMain {

	public static void main(String[] args) {
		Shape[] shapes = { new Rectangle(5, 6), new RectTriangle(6, 2) };

		for (Shape shape : shapes) {
			System.out.println("area:" + shape.getArea());
			System.out.println("perimeter:" + shape.getPerimeter());

			//shape이 Resizable을 구현했으면 true
			if (shape instanceof Resizable) {
				Resizable resizable = (Resizable) shape;
				resizable.resize(0.5);
				System.out.println("new area:" + shape.getArea());
				System.out.println("new perimeter:" + shape.getPerimeter());
			}
		}
	}
}