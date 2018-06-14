package me.tang.math;

public class Circle {
	private Point p;
	private int r;

	public Circle(Point p, int r) {
		this.p = p;
		this.r = r;
	}

	/**
	 * 计算圆面积
	 * 
	 * @return
	 */
	public double getArea() {
		return Math.PI * r * r;
	}

	/**
	 * 计算当前图形是否包含Point p 指定的点
	 * 
	 * @param p
	 * @return
	 */
	public boolean contains(Point p) {
		double rangeX = p.getX() - this.p.getX();// 圆心到点的水平距离
		/*
		 * if(rangeX < 0){ rangeX = -rangeX;//保证距离为正 }
		 */
		double rangeY = p.getY() - this.p.getY();// 圆心到点的竖直距离
		/*
		 * if(rangeY < 0){ rangeY = - rangeY;//保证距离为正 }
		 */
		double range = Math.sqrt(rangeX * rangeX + rangeY * rangeY);
		if (range <= r) {
			return true;
		}
		return false;
	}

	/**
	 * 图形是否包含坐标x,y
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean contains(int x, int y) {
		double rangeX = x - this.p.getX();// 圆心到点的水平距离
		/*
		 * if(rangeX < 0){ rangeX = -rangeX;//保证距离为正 }
		 */
		double rangeY = y - this.p.getY();// 圆心到点的竖直距离
		/*
		 * if(rangeY < 0){ rangeY = - rangeY;//保证距离为正 }
		 */
		double range = Math.sqrt(rangeX * rangeX + rangeY * rangeY);
		if (range <= r) {
			return true;
		}
		return false;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public static void main(String[] args) {
		//初始化圆心
		Point p = new Point(2,2);
		//初始化圆
		Circle c = new Circle(p,2);
		
		//声明定义指定的点
		Point p2 = new Point(2,5);
		System.out.println("是否包含指定的点："+c.contains(p2));
		System.out.println("获取圆面积："+c.getArea());
		System.out.println("是否包含指定的坐标："+c.contains(2, 4));

	}

}
