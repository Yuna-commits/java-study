package com.bit2025.paint.canvas;

public class Canvas {
//	public void drawPoint(Point point) {
//		point.show();
//	}

//	//변화하면 x -> OCP
//	public void drawColorPoint(ColorPoint point) {
//		point.show();
//	}

//	public void drawShape(Shape shape) {
//		shape.draw();
//	}
	//Drawable을 구현한 객체만 가능
	public void draw(Drawable drawable) {
		drawable.draw();
	}
}
