package com.entor.arraySort;

import java.util.Arrays;

/**
 * ��������
 * 
 * @author Administrator
 *
 */
public class SortTest4 {
	public static void main(String[] args) {
		int[] arr = { 8, 2, 3, 7, 1 };
		// ���ѭ������Ҫ�������
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			int insert = arr[i];// ���������
			int j = i - 1;
			for (; j >= 0 && insert < arr[j]; j--) {
				arr[j + 1] = arr[j];// ����Ԫ�ظ������Ԫ��Ųλ��
				count++;
				System.out.println("====>��" + count + "�γ��Բ����" + Arrays.toString(arr));
			}
			arr[j + 1] = insert;
			System.out.println("===========>��" + i + "�������" + Arrays.toString(arr));
		}
	}
}
