package com.entor.homework;

public class CircleTest {
	public static void main(String[] args) {
		Circle circle = new Circle(new Point(2, 3), 3);
		if (circle.contains(new Point(3, 3))) {
			System.out.println("当前圆包含点(3,3)！");
		} else {
			System.out.println("当前圆不包含点(3,3)！");
		}
		System.out.println("当前圆的面积：" + circle.calcArea());
	}
}
