package com.bit2025.paint.shape;

import com.bit2025.paint.canvas.Drawable;
import com.bit2025.paint.point.Point;

public abstract class Shape implements Drawable {
	private Point[] points;
	private String fillColor;
	private String lineColor;
}
