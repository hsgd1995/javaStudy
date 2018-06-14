package me.tang.shape;

/**
 * 矩形类
 * 
 * @author Administrator
 *
 */
public class Rectangle extends Shape {
	private int h;// 高
	private int w;// 宽

	public Rectangle() {
		super();
	}

	public Rectangle(Point localtion, int h, int w) {
		super(localtion);
		this.h = h;
		this.w = w;
	}

	/**
	 * 计算面积
	 */
	@Override
	public void area() {
		System.out.println("矩形面积为：" + h * w);
	}

	/**
	 * 检查是否包含指定坐标
	 */
	@Override
	public void contains(Point p) {
		// 矩形左边界
		double leftRange = getLocaltion().getX() - w / 2;
		// 矩形右边界
		double rightRange = getLocaltion().getY() + w / 2;
		// 矩形上边界
		double topRange = getLocaltion().getY() + h / 2;
		//// 矩形下边界
		double bottomRange = getLocaltion().getY() - h / 2;

		if (leftRange <= p.getX() && p.getX() <= rightRange && bottomRange <= p.getY() && p.getY() <= topRange) {
			System.out.println("该矩形包含指定的点！");
		} else {
			System.err.println("该矩形不包含指定的点！");
		}
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

}
