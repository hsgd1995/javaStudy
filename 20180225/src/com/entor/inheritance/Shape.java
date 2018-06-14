package com.entor.inheritance;

/**
 * 平面图形
 * 
 * @author Administrator
 *
 */
public class Shape {
	private String color;// 颜色
	private Point p;// 中心点

	public Shape() {
	}

	public Shape(String color, Point p) {
		super();
		this.color = color;
		this.p = p;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	/**
	 * 计算面积方法
	 * 
	 * @return
	 */
	public double calcArea() {
		return 0.0;
	}
}
