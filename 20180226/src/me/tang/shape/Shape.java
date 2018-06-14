package me.tang.shape;

/**
 * 图形抽象类
 * 
 * @author Administrator
 *
 */
public abstract class Shape {
	private Point localtion;// 中心点

	public Shape() {
		super();
	}

	public Shape(Point localtion) {
		super();
		this.localtion = localtion;
	}

	/**
	 * 计算面积
	 * 
	 * @return
	 */
	public abstract void area();

	/**
	 * 检查是否包含指定坐标
	 * 
	 * @return
	 */
	public abstract void contains(Point p);

	public Point getLocaltion() {
		return localtion;
	}

	public void setLocaltion(Point localtion) {
		this.localtion = localtion;
	}

}
