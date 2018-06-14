package me.tang.math;

public class Rectangle {
	private Point p;
	private int w;
	private int h;

	public Rectangle(Point p, int w, int h) {
		this.p = p;
		this.w = w;
		this.h = h;
	}

	/**
	 * 计算圆面积
	 * 
	 * @return
	 */
	public double getArea() {
		return w * h;
	}

	/**
	 * 计算当前图形是否包含Point p 指定的点
	 * 
	 * @param p
	 * @return
	 */
	public boolean contains(Point p) {
		// 矩形左边界
		double leftRange = this.p.getX() - w / 2;
		// 矩形右边界
		double rightRange = this.p.getY() + w / 2;
		// 矩形上边界
		double topRange = this.p.getY() + h / 2;
		//// 矩形下边界
		double bottomRange = this.p.getY() - h / 2;

		System.out.println(leftRange + " " + rightRange + "  " + topRange + "  " + bottomRange);
		if (leftRange <= p.getX() && p.getX() <= rightRange && bottomRange <= p.getY() && p.getY() <= topRange) {
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
		// 矩形左边界
		double leftRange = this.p.getX() - w / 2;
		// 矩形右边界
		double rightRange = this.p.getY() + w / 2;
		// 矩形上边界
		double topRange = this.p.getY() + h / 2;
		//// 矩形下边界
		double bottomRange = this.p.getY() - h / 2;
		System.out.println(leftRange + " " + rightRange + "  " + topRange + "  " + bottomRange);
		if(leftRange <= x && x <= rightRange && bottomRange <= y && y <= topRange){
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

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public static void main(String[] args) {
		Point p = new Point(3, 3);
		Rectangle r = new Rectangle(p, 2, 2);
		Point p2 = new Point(2, 5);
		System.out.println("是否包含指定的点："+r.contains(p2));
		System.out.println("获取矩形面积："+r.getArea());
		System.out.println("是否包含指定坐标："+r.contains(5, 3));
		int a=50;
		String ab = a>=90?"A":60<=a&&a<=80?"B":a<60?"C":"";
		System.out.println(ab);
	}
}
