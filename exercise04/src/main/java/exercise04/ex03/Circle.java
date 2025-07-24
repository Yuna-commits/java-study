package exercise04.ex03;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		double result = radius * radius * Math.PI;
		return Math.round(result * 10) / 10.0;
	}

}
