package com.entor.practices;

/**
 * ��1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
 * 
 * @author Administrator
 *
 */
public class PracticeTest {
	public static void main(String[] args) {
		// ��λ��ʮλ����λ��������1-4
		int count = 0;
		for (int i = 1; i <= 4; i++) {
			// i�ǰ�λ
			for (int j = 1; j <= 4; j++) {
				// j��ʮλ
				if (i == j) {
					continue;
				}
				for (int k = 1; k <= 4; k++) {
					// k�Ǹ�λ
					if (i == k || j == k) {
						continue;
					}
					count++;
					System.out.println("������������λ����" + (100 * i + 10 * j + k));
				}
			}
		}
		System.out.println("������������λ���ĸ�����" + count);

		System.out.println(1 / 0.0);
	}
}
