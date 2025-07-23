package dev.reuise.core;

public class Rect {
	private double bottom;
	private double height;
	private double left;
	private double right;
	private double top;
	private double width;
	private double x;
	private double y;

	public Rect() {
	}

	public Rect(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		top = y;
		bottom = y+height;
		right = x+width;
		left = x;
	}

	public Rect(double x, double y, double width) {
		this(x, y, width, 0);
	}

	public Rect(double x, double y) {
		this(x, y, 0, 0);
	}

	public Rect(double x) {
		this(x, 0, 0, 0);
	}

	public double getBottom() {
		return bottom;
	}

	public void setBottom(double bottom) {
		this.bottom = bottom;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLeft() {
		return left;
	}

	public void setLeft(double left) {
		this.left = left;
	}

	public double getRight() {
		return right;
	}

	public void setRight(double right) {
		this.right = right;
	}

	public double getTop() {
		return top;
	}

	public void setTop(double top) {
		this.top = top;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}