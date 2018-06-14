package com.entor.inheritance;

/**
 * Բ��
 * 
 * @author Administrator
 *
 */
public class Circle extends Shape {
	private static final double PI = 3.14;// ����PI
	private double r;// �뾶

	public Circle() {
	}

	public Circle(String color, Point p, double r) {
		super(color, p);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	/**
	 * ����Բ�����
	 */
	@Override
	public double calcArea() {
		return PI * r * r;
	}

}
