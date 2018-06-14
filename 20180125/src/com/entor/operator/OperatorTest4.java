package com.entor.operator;

public class OperatorTest4 {

	public static void main(String[] args) {
		// 定义两个整数
		int a = 1, b = 2;

		// a++ => a = a + 1，先使用a，然后再计算
		// ++a => a = a + 1，先计算，后使用a

		System.out.println("a++=>" + a++);// 1
		System.out.println("++a=>" + ++a);// 3

		System.out.println("b--=>" + b--);// 2
		System.out.println("--b=>" + --b);// 0

	}

}
