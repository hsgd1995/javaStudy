package com.entor.inheritance;

/**
 * ����
 * 
 * @author Administrator
 *
 */
public class Rectangle extends Shape {
	private double length;// ��
	private double width;// ��

	public Rectangle() {
	}

	public Rectangle(String color, Point p, double length, double width) {
		super(color, p);
		this.length = length;
		this.width = width;
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

	/**
	 * ����������
	 */
	@Override
	public double calcArea() {
		return length * width;
	}
}
