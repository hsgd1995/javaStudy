package com.entor.homework;

public class CircleTest {
	public static void main(String[] args) {
		Circle circle = new Circle(new Point(2, 3), 3);
		if (circle.contains(new Point(3, 3))) {
			System.out.println("��ǰԲ������(3,3)��");
		} else {
			System.out.println("��ǰԲ��������(3,3)��");
		}
		System.out.println("��ǰԲ�������" + circle.calcArea());
	}
}
