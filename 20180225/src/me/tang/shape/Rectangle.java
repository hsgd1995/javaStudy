package me.tang.shape;

/**
 * 矩形
 * 
 * @author Administrator
 *
 */
public class Rectangle extends Shape {
	private double length;// 长
	private double width;// 宽

	public Rectangle(double length, double width, String color, Point p) {
		super(color, p);
		this.length = length;
		this.width = width;
	}

	/**
	 * 计算矩形面积
	 */
	@Override
	public double calcArea() {
		return length * width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
