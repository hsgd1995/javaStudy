package com.entor.array;

/**
 * �����������{8,2,3,7,1}
 * 
 * @author Administrator
 *
 */
public class ArrayTest3 {
	public static void main(String[] args) {
		// ��������
		int[] array = { 8, 2, 3, 7, 1 };
		// �������
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// �������
		for(int j = array.length - 1; j >=0; j--){
			System.out.println(array[j]);
		}
	}
}
