package com.entor.array;

/**
 * 
 * java����5��ѧ���ɼ��ֱ�Ϊ��66��77��88��99��55�����������ǵ��ܳɼ���ƽ���ɼ��������
 * 
 * @author Administrator
 *
 */
public class ArrayTest9 {
	public static void main(String[] args) {
		// ��������
		double[] array = { 66, 77, 88, 99, 55 };
		// �Ӻ����еĳɼ�
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		// ���
		System.out.println("�ɼ��ܺͣ�" + sum);
		System.out.println("ƽ���ɼ���" + (sum / array.length));
	}
}
