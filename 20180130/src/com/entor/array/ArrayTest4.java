package com.entor.array;

/**
 * 创建数组方式二：new
 * 
 * @author Administrator
 *
 */
public class ArrayTest4 {
	public static void main(String[] args) {
		// 创建长度为5的int类型的数组
		int[] array = new int[5];
		char[] chars = new char[5];
		boolean[] boos = new boolean[5];
		double[] dous = new double[5];
		// 输出数组
		for (int i = 0; i < dous.length; i++) {
			System.out.println(dous[i]);
		}

		// 数组填充8，2，3，7，1
		array[0] = 8;
		array[1] = 2;
		array[2] = 3;
		array[3] = 7;
		array[4] = 1;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
