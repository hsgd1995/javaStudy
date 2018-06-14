package com.entor.array;

import java.util.Arrays;

/**
 * 倒置数组{8,2,3,7,1}的顺序，过程发生在数组内部，并输出该数组
 * 
 * @author Administrator
 *
 */
public class ArrayTest7 {
	public static void main(String[] args) {
		// 创建数组
		int[] array = { 8, 2, 3, 7, 1 };
		// 数组内部元素交换
		// 8-1，2-7
		// 1,7,3,2,8
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		// 输出数组
		System.out.println(Arrays.toString(array));
	}
}
