package com.entor.inheritance;

/**
 * 圆形
 * 
 * @author Administrator
 *
 */
public class Circle extends Shape {
	private static final double PI = 3.14;// 常量PI
	private double r;// 半径

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
	 * 计算圆形面积
	 */
	@Override
	public double calcArea() {
		return PI * r * r;
	}

}
