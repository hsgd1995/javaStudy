package com.entor.array;

/**
 * java����5��ѧ�����ɼ��ֱ�Ϊ77��88��99��61.5��73�� �������鱣����Щ���ݣ���������ĸ�ѧ���ĳɼ���
 * 
 * @author Administrator
 *
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		// ���ǵ��ɼ����ͣ������Ԫ������Ӧ���Ǹ�����
		double[] scores = { 77, 88, 99, 61.5, 73 };
		// ������ĸ�ѧ��Ԫ��
		System.out.println("���ĸ�ѧ���ɼ���" + scores[3]);

		// �������ѧ���ĳɼ�
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);

		// ����ظ����⣬����ѭ��
		int index = 0;
		while (index < scores.length) {
			System.out.println(scores[index]);
			index++;
		}
	}
}
