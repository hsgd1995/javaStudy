package com.entor.practice1;

/**
 * 12.�ж�һ���˽������Ƕ���λ����int��Χ�ڣ�
 * 
 * @author Administrator
 *
 */
public class PracticeTest2 {
	public static void main(String[] args) {
		int num = 01234567;// 8������1234567
		int count = 0;// ��¼����8�Ĵ���
		int temp = num;// temp��Ϊ������
		while (true) {
			count++;
			if (temp / 8 == 0) {
				break;
			} else {
				temp /= 8;
			}
		}
		System.out.println(num + "��" + count + "λ����");
	}
}
