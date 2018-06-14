package com.entor.abstractclass;

/**
 * ²âÊÔÀà
 * @author Administrator
 *
 */
public class ShapeTest {
	public static void main(String[] args) {
		Shape shape = new Circle("ÂÌÉ«",new Point(1,2),2);
		System.out.println(shape.calcArea());
	}
}
