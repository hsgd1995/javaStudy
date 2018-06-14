package com.entor.operator;

public class OperatorTest5 {

	public static void main(String[] args) {
		// 定义两个整数
		int a = 1, b = 2;

		// 用两种方法，交换a和b的值

		// 方式一：借助中间变量
		int temp = a;
		a = b;
		b = temp;

		// 方式二：借助运算
		a = a + b;// a = 3
		b = a - b;// b = 1
		a = a - b;// a = 2

	}

}
