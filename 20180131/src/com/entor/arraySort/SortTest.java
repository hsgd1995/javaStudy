package com.entor.arraySort;

import java.util.Arrays;

/**
 * ѡ������
 * 
 * @author Administrator
 *
 */
public class SortTest {
	public static void main(String[] args) {
		int[] arr = { 8, 2, 3, 7, 1 };
		// ѭ����ÿ��ѡ��һ��Ԫ�س�����Ϊ��һ��Ԫ��
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					// ����ֵ
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				count++;
				System.out.println("====>��" + count + "�γ��Խ�����" + Arrays.toString(arr));
			}
			System.out.println("===========>��" + (i + 1) + "�������" + Arrays.toString(arr));
		}
	}
}
