package com.entor.wraper;

/**
 * JDK�ṩ�Ļ�������double�İ�װ��
 * 
 * @author Administrator
 *
 */
public class DoubleTest {
	public static void main(String[] args) {
		Double dou = 1.23;
		byte bye = dou.byteValue();
		System.out.println(bye);
		System.out.println(Double.compare(1.1, 1.10));
		System.out.println(Double.parseDouble("12.21"));
		System.out.println(Double.valueOf("12.21"));
		Byte by = dou.byteValue();
		System.out.println(by);
	}
}
