package me.tang.shape;

/**
 * 圆类
 * 
 * @author Administrator
 *
 */
public class Circle extends Shape {
	private double r;// 半径

	public Circle() {
		super();
	}

	public Circle(String color, Point p, double r) {
		super(color, p);
		this.r = r;
	}

	/**
	 * 计算圆形面积
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
