package com.entor.array;

/**
 * java����5��ѧ���ɼ��ֱ�Ϊ��66��77��88��99��55�����ҳ���óɼ������ɼ��������
 * 
 * @author Administrator	
 *
 */
public class ArrayTest8 {
	public static void main(String[] args) {
		// ��������
		int[] array = { 66, 77, 88, 99, 55 };
		// �������������óɼ������ɼ�
		int max = array[0], min = array[0];// �����һ��Ԫ�ؾ�����óɼ��������ɼ�
		// �������max��min��ʣ���Ԫ�رȽ�
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];// ���¸�ֵ��óɼ�
			}
			if (array[i] < min) {
				min = array[i];// ���¸�ֵ���ɼ�
			}
		}
		// ���
		System.out.println("��óɼ���" + max);
		System.out.println("���ɼ���" + min);
	}
}
