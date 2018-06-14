package com.entor.arraySort;

import java.util.Arrays;

/**
 * 插入排序
 * 
 * @author Administrator
 *
 */
public class SortTest4 {
	public static void main(String[] args) {
		int[] arr = { 8, 2, 3, 7, 1 };
		// 外层循环控制要插入的数
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			int insert = arr[i];// 带插入的数
			int j = i - 1;
			for (; j >= 0 && insert < arr[j]; j--) {
				arr[j + 1] = arr[j];// 相邻元素给插入的元素挪位置
				count++;
				System.out.println("====>第" + count + "次尝试插入后：" + Arrays.toString(arr));
			}
			arr[j + 1] = insert;
			System.out.println("===========>第" + i + "轮排序后：" + Arrays.toString(arr));
		}
	}
}
