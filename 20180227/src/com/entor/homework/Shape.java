package com.entor.homework;

/**
 * ƽ��ͼ��
 * 
 * @author Administrator
 *
 */
public abstract class Shape {
	public static final double PI = 3.14;
	private Point location;// ���ĵ�

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
	 * �����������
	 * 
	 * @return
	 */
	public abstract double calcArea();

	/**
	 * �ж�ͼ������λ�ù�ϵ
	 * 
	 * @param p
	 * @return
	 */
	public abstract boolean contains(Point p);
}
