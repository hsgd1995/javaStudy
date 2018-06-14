package me.tang.shape;

/**
 * 圆类
 * 
 * @author Administrator
 *
 */
public class Circle extends Shape {
	private int r;// 半径
	private static final double PI = 3.14;

	public Circle() {
		super();
	}

	public Circle(Point localtion, int r) {
		super(localtion);
		this.r = r;
	}

	/**
	 * 计算面积
	 */
	@Override
	public void area() {
		System.out.println("圆的面积为：" + PI * r * r);
	}

	/**
	 * 检查是否包含指定坐标
	 */
	@Override
	public void contains(Point p) {
		double rangeX = p.getX() - getLocaltion().getX();// 圆心到点的水平距离
		double rangeY = p.getY() - getLocaltion().getY();// 圆心到点的竖直距离
		double range = Math.sqrt(rangeX * rangeX + rangeY * rangeY);
		if (range <= r) {
			System.out.println("该圆包含指定的点！");
		} else {
			System.err.println("该圆不包含指定的点！");
		}
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

}
