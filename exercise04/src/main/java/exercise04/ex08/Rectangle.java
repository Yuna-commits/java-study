package exercise04.ex08;

public class Rectangle extends Shape implements Resizable {
	public Rectangle(double width, double height) {
		super(width, height);
	}

	@Override
	public void resize(double rate) {
		setWidth(getWidth()*rate);
		setHeight(getHeight()*rate);
	}

	@Override
	public double getArea() {
		return (getWidth() * getHeight());
	}

	@Override
	public double getPerimeter() {
		return ((getWidth() + getHeight()) * 2);
	}
}
