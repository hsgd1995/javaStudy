package com.entor.array;

import java.util.Arrays;

/**
 * ��������{8,2,3,7,1}��һ�������飬��������������
 * 
 * @author Administrator
 *
 */
public class ArrayTest6 {
	public static void main(String[] args) {
		// Դ����
		int[] src = { 8, 2, 3, 7, 1 };
		// Ŀ������
		int[] dest = new int[src.length];
		// ���ƹ���
		for (int i = 0; i < dest.length; i++) {
			dest[i] = src[i];
		}
		// ���Ŀ������
		System.out.println(Arrays.toString(dest));
	}
}
