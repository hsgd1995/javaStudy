package com.entor.array;

/**
 * �������鷽ʽ����new
 * 
 * @author Administrator
 *
 */
public class ArrayTest4 {
	public static void main(String[] args) {
		// ��������Ϊ5��int���͵�����
		int[] array = new int[5];
		char[] chars = new char[5];
		boolean[] boos = new boolean[5];
		double[] dous = new double[5];
		// �������
		for (int i = 0; i < dous.length; i++) {
			System.out.println(dous[i]);
		}

		// �������8��2��3��7��1
		array[0] = 8;
		array[1] = 2;
		array[2] = 3;
		array[3] = 7;
		array[4] = 1;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
