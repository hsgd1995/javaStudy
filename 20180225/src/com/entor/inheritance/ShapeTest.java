package com.entor.inheritance;

public class ShapeTest {
	public static void main(String[] args) {
		// 圆心
		Point c1 = new Point(1, 2);
		// 圆形
		Circle c = new Circle("蓝色", c1, 5);
		System.out.println("圆形面积：" + c.calcArea());

		// 中心点
		Point c2 = new Point(3, 4);
		// 矩形
		Rectangle r = new Rectangle("绿色", c2, 2.5, 2);
		System.out.println("举行面积：" + r.calcArea());
	}
}
