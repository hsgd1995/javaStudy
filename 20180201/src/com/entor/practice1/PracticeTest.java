package com.entor.practice1;

/**
 * 12.�ж�һ������С��10λ����λ������������999������� �����Ǹ�3λ��������
 * 
 * @author Administrator
 *
 */
public class PracticeTest {
	public static void main(String[] args) {
		int num = 123456789;
		int count = 0;// ��¼����10�Ĵ���
		int temp = num;// temp��Ϊ������
		while (true) {
			count++;
			if (temp / 10 == 0) {
				break;
			} else {
				temp /= 10;
			}
		}
		System.out.println(num + "��" + count + "λ����");
	}
}
