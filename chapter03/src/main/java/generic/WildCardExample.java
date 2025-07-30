package generic;

import java.util.ArrayList;
import java.util.List;

//import com.bit2025.paint.point.Point;
import com.bit2025.paint.shape.Circle;
import com.bit2025.paint.shape.Rectangle;
import com.bit2025.paint.shape.Shape;
import com.bit2025.paint.shape.Triangle;

public class WildCardExample {

	public static void main(String[] args) {
		// Point는 Shape과 상속 관계 x
//		List<Point> points = new ArrayList<Point>();
//		draw(points);

		List<Circle> circles = new ArrayList<Circle>();
		circles.add(new Circle());
		draw(circles);

		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle());
		shapes.add(new Rectangle());
		draw(shapes);

		System.out.println("====================");
		draw(new Circle(), new Triangle(), new Circle(), new Rectangle());
	}

	// 와일드카드
	// Shape이거나 Shape과 상속관계인 타입(Cirlce, Triangle, Rectangle)만 가능하도록 제한
	public static void draw(List<? extends Shape> shapes) {
		for (Shape shape : shapes) {
			shape.draw();
		}
	}

	// 타입 제한
	public static <T extends Shape> void draw(T... shapes) {
		for (Shape shape : shapes) {
			shape.draw();
		}
	}
}
