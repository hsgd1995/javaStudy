package com.entor.arraySort;

import java.util.Arrays;

/**
 * ð������
 * 
 * @author Administrator
 *
 */
public class SortTest2 {
	public static void main(String[] args) {
		int[] arr = { 8, 2, 3, 7, 1 };
		// ���ѭ���������������
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			// �ڲ�ѭ����������Ԫ�رȽ�
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				count++;
				System.out.println("====>��" + count + "�γ��Խ�����" + Arrays.toString(arr));
			}
			System.out.println("===========>��" + (i + 1) + "�������" + Arrays.toString(arr));
		}
	}
}
