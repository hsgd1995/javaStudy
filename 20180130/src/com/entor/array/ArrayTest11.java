package com.entor.array;

import java.util.Arrays;

/**
 * 
 * ������10ֻ����9ֻ���ӣ���Щ��������������ӣ���ô��������1ֻ����������ֻ�����ϵĸ��ӡ�<br>
 * ��ֻ����������Щ���ӣ�
 * 
 * @author Administrator
 *
 */
public class ArrayTest11 {
	public static void main(String[] args) {
		// �����Ӻ͸��ӱ��
		int[] nest = new int[9];// ���������������ӵı�ţ�Ԫ�ص���ÿֻ���ӵĸ���������0��8��
		int[] pigeon = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// [0,9]
		// ģ����ӷ������ӵĹ���
		// ÿ����ֻ���ӷ�����ֻ����
		// ���Ӻ�������ܹ���10��
		// ������Ӵ�1�ſ�ʼ���
		for (int i = 0; i < pigeon.length; i++) {
			int n_index = (int) (Math.random() * 9);// [0,8]
			System.out.println(pigeon[i] + "�Ÿ��ӷ�����" + n_index + "������");
			nest[n_index]++;
		}
		// ��������и��ӵ����
		System.out.println(Arrays.toString(nest));
	}
}
