package com.entor.inheritance;

/**
 * ƽ��ͼ��
 * 
 * @author Administrator
 *
 */
public class Shape {
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
	public double calcArea() {
		return 0.0;
	}
}
