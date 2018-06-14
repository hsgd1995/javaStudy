package com.entor.arraySort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 
 * @author Administrator
 *
 */
public class SortTest2 {
	public static void main(String[] args) {
		int[] arr = { 8, 2, 3, 7, 1 };
		// 外层循环控制排序的轮数
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			// 内层循环控制两两元素比较
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				count++;
				System.out.println("====>第" + count + "次尝试交换后：" + Arrays.toString(arr));
			}
			System.out.println("===========>第" + (i + 1) + "轮排序后：" + Arrays.toString(arr));
		}
	}
}
