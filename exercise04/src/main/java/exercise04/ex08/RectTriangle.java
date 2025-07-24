package exercise04.ex08;

public class RectTriangle extends Shape {
	public RectTriangle(double width, double height) {
		super(width, height);
	}

	@Override
	public double getArea() {
		return (getWidth() * getHeight() * 0.5);
	}

	@Override
	public double getPerimeter() {
		double w = getWidth();
		double h = getHeight();

		return (w + h + Math.sqrt(w * w + h * h));
	}
}
