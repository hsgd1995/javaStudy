package com.entor.array;

/**
 * 
 * ������{8,2,3,7,1}��������һ��Ԫ��
 * 
 * @author Administrator
 *
 */
public class ArrayTest10 {
	public static void main(String[] args) {
		// ��������
		// ���ֵ�������[0,4]
		int[] array = { 8, 2, 3, 7, 1 };

		// ��������
		for (int i = 0; i < 10; i++) {
			// ��ѧ���������
			int index = (int) (Math.random() * 5);// [0,4]
			System.out.println("������Ԫ�أ�" + array[index]);
		}
	}
}
