package me.tang.shape;

/**
 * 图形类
 * 
 * @author Administrator
 *
 */
public class Shape {
	private String color;// 颜色
	private Point p;// 中心位置

	public Shape() {

	}

	public Shape(String color, Point p) {
		super();
		this.color = color;
		this.p = p;
	}

	/**
	 * 计算面积
	 */
	public double calcArea() {
		return 0.0;
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

}
