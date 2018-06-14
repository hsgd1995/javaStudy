package me.tang.shape;

/**
 * Բ��
 * 
 * @author Administrator
 *
 */
public class Circle extends Shape {
	private double r;// �뾶

	public Circle() {
		super();
	}

	public Circle(String color, Point p, double r) {
		super(color, p);
		this.r = r;
	}

	/**
	 * ����Բ�����
	 */
	@Override
	public double calcArea() {
		return Math.PI * r * r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

}
