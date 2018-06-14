package com.entor.operator;

public class OperatorTest2 {

	public static void main(String[] args) {
		// 定义三个整数
		int a = 1, b = 3, c = 2;

		// 关系运算
		System.out.println("a > b = " + (a > b));// false
		System.out.println("b < c = " + (b < c));// false
		System.out.println("a >= c = " + (a >= c));// false
		System.out.println("b == c = " + (b == c));// false
		System.out.println("a <= c = " + (a <= c));// true
		System.out.println("a != c = " + (a != c));// true

		// 逻辑运算
		System.out.println(a > b && b > c);// false
		System.out.println(a > b || b > c);// true
		System.out.println(!(a > b));// true

		System.out.println(!false);
		System.out.println(!true);

		boolean boo1 = true;
		boolean boo2 = false;

		System.out.println(!boo1);
		System.out.println(!boo2);

	}

}
