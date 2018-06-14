package com.entor.datatype;

/**
 * 数据类型转换
 * 
 * @author Administrator
 *
 */
public class DataTypeTest2 {
	public static void main(String[] args) {
		int int1 = 123000;
		byte byte1 = (byte) int1;
		System.out.println(byte1);// 一定要考察类型转换的风险

		byte byte2 = 127;
		int int2 = byte2;
		System.out.println(int2);// 自动转换

		// 在运算的时候，最终的结果保存为与范围最大的操作数的类型一致；
		System.out.println("10 / 3 = " + (10 / 3));
		System.out.println("10 / 3.0 = " + (10 / 3.0));
	}
}
