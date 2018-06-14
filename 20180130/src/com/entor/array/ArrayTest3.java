package com.entor.array;

/**
 * 倒序输出数组{8,2,3,7,1}
 * 
 * @author Administrator
 *
 */
public class ArrayTest3 {
	public static void main(String[] args) {
		// 创建数组
		int[] array = { 8, 2, 3, 7, 1 };
		// 正序输出
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// 倒序输出
		for(int j = array.length - 1; j >=0; j--){
			System.out.println(array[j]);
		}
	}
}
