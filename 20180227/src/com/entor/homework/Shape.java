package com.entor.homework;

/**
 * 平面图形
 * 
 * @author Administrator
 *
 */
public abstract class Shape {
	public static final double PI = 3.14;
	private Point location;// 中心点

	public Shape() {
	}

	public Shape(Point location) {
		super();
		this.location = location;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	/**
	 * 计算面积方法
	 * 
	 * @return
	 */
	public abstract double calcArea();

	/**
	 * 判断图形与点的位置关系
	 * 
	 * @param p
	 * @return
	 */
	public abstract boolean contains(Point p);
}
