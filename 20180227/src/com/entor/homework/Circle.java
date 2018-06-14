package com.entor.homework;

public class Circle extends Shape {

	private double r;

	public Circle() {
	}

	public Circle(Point location, double r) {
		super(location);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double calcArea() {
		return PI * r * r;
	}

	@Override
	public boolean contains(Point p) {
		// 1.���Բ�ĵ���ƽ�������ƽ��
		int hypotenuse_2 = (p.getX() - getLocation().getX()) * (p.getX() - getLocation().getX())
				+ (p.getY() - getLocation().getY()) * (p.getY() - getLocation().getY());
		// 2.������뾶�Ƚ�
		if (hypotenuse_2 > r * r)
			return false;
		return true;
	}

}
