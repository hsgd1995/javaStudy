package com.entor.abstractclass;

/**
 * ������
 * @author Administrator
 *
 */
public class ShapeTest {
	public static void main(String[] args) {
		Shape shape = new Circle("��ɫ",new Point(1,2),2);
		System.out.println(shape.calcArea());
	}
}
