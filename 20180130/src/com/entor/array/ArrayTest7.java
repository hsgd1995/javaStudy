package com.entor.array;

import java.util.Arrays;

/**
 * ��������{8,2,3,7,1}��˳�򣬹��̷����������ڲ��������������
 * 
 * @author Administrator
 *
 */
public class ArrayTest7 {
	public static void main(String[] args) {
		// ��������
		int[] array = { 8, 2, 3, 7, 1 };
		// �����ڲ�Ԫ�ؽ���
		// 8-1��2-7
		// 1,7,3,2,8
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		// �������
		System.out.println(Arrays.toString(array));
	}
}
