package com.entor.array;

import java.util.Arrays;

/**
 * 复制数组{8,2,3,7,1}到一个新数组，并输出这个新数组
 * 
 * @author Administrator
 *
 */
public class ArrayTest6 {
	public static void main(String[] args) {
		// 源数组
		int[] src = { 8, 2, 3, 7, 1 };
		// 目的数组
		int[] dest = new int[src.length];
		// 复制过程
		for (int i = 0; i < dest.length; i++) {
			dest[i] = src[i];
		}
		// 输出目的数组
		System.out.println(Arrays.toString(dest));
	}
}
