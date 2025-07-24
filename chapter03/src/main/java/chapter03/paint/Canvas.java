package chapter03.paint;

public class Canvas {
	public void drawPoint(Point point) {
		point.show();
	}

	//변화하면 x -> OCP
	public void drawColorPoint(ColorPoint point) {
		point.show();
	}
}
