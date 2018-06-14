package com.entor.radix;

/**
 * 进制
 * 
 * @author Administrator
 *
 */
public class RadixTest {
	public static void main(String[] args) {
		// 通常字面量都是十进制
		// 定义一个八进制数
		int int1 = 012;
		System.out.println(int1);
		// 定义一个十六进制数
		int int2 = 0x12;
		System.out.println(int2);
		// 定义一个科学计数的浮点数
		double dou = 2.0E3;// 2.0乘以10的3次方
		System.out.println(dou);
	}
}
