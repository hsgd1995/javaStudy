package com.entor.array;

import java.util.Arrays;

/**
 * ��1-100��ŵ�������
 * 
 * @author Administrator
 *
 */
public class ArrayTest5 {
	public static void main(String[] args) {
		// ���������飬����Ϊ100
		int[] nums = new int[100];
		// ���������0-99����1-100���1
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		// ������飺Arrays.toString()
		System.out.println(Arrays.toString(nums));
	}
}
