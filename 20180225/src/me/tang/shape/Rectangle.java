package me.tang.shape;

/**
 * ����
 * 
 * @author Administrator
 *
 */
public class Rectangle extends Shape {
	private double length;// ��
	private double width;// ��

	public Rectangle(double length, double width, String color, Point p) {
		super(color, p);
		this.length = length;
		this.width = width;
	}

	/**
	 * ����������
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
