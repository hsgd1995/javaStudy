package com.entor;

public class RegexTest {
	public static void main(String[] args) {
		// 1.����������ʽ
		// ^��ʾ������ʽ��ʼλ�ã�$��ʾ������ʽ����λ��
		String regex = "^[a-zA-Z]\\w{8,10}$";// ���ַ��Ǵ�Сд��ĸ��ʣ��8-10�����֡���Сд��ĸ���»������
		// 2.��������֤���ַ���
		String dest = "A1b2c312aaa1";
		// 3.��֤
		boolean result = dest.matches(regex);
		if (result) {
			System.out.println("��֤ͨ����");
		} else {
			System.out.println("��֤��ͨ����");
		}
		
		// ����2
		regex = "^(\\+86|0086)?\\s?\\d{11}$";
		System.out.println("+86 13912345678".matches(regex));
	}
}
