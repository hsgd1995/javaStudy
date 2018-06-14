package com.entor.array;

import java.util.Arrays;

/**
 * 将1-100存放到数组中
 * 
 * @author Administrator
 *
 */
public class ArrayTest5 {
	public static void main(String[] args) {
		// 创建空数组，长度为100
		int[] nums = new int[100];
		// 数组的索引0-99，与1-100相差1
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		// 输出数组：Arrays.toString()
		System.out.println(Arrays.toString(nums));
	}
}
