package com.entor.abstractclass;

/**
 * ƽ��ͼ��
 * 
 * @author Administrator
 *
 */
public abstract class Shape {
	private String color;// ��ɫ
	private Point p;// ���ĵ�

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
	 * �����������
	 * 
	 * @return
	 */
	public abstract double calcArea();
}
