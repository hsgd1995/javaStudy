package com.entor.arraySort;

import java.util.Arrays;

/**
 * 选择排序
 * 
 * @author Administrator
 *
 */
public class SortTest {
	public static void main(String[] args) {
		int[] arr = { 8, 2, 3, 7, 1 };
		// 循环，每次选择一个元素出来作为第一个元素
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					// 交换值
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				count++;
				System.out.println("====>第" + count + "次尝试交换后：" + Arrays.toString(arr));
			}
			System.out.println("===========>第" + (i + 1) + "轮排序后：" + Arrays.toString(arr));
		}
	}
}
