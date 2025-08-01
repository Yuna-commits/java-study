package com.bit2025.paint.point;

import com.bit2025.paint.canvas.Drawable;

public class Point implements Drawable {
	private int x, y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

//	public void disappear() {
//		System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다.");
//	}

	@Override
	public void draw() {
		show();
	}
	
	public void show() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}

	public void show(boolean visible) {
		if (visible) {
			show();
		} else {
			System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다.");
		}
	}
}
