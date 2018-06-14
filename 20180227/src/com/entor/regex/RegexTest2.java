package com.entor.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest2 {
	public static void main(String[] args) {
		String regex = "^\\d{3,4}-\\d{7,8}$";

		// 1.��ʽһ
		long a = System.currentTimeMillis();
		for (int i = 1; i <= 100000; i++) {
			"010-84717471".matches(regex);
		}
		long b = System.currentTimeMillis();
		System.out.println("��ʽһ��" + (b - a));

		// 2.��ʽ��
		// ����������ʽ�ַ���������ģʽ����
		Pattern pattern = Pattern.compile(regex);
		String input = "0415-5561111";
		// ͨ��ģʽ����ʹ�ƥ����ַ��������ɱȽ���
		Matcher matcher = pattern.matcher(input);
		a = System.currentTimeMillis();
		for (int i = 1; i <= 100000; i++) {
			// �Ƚ��ַ�������ñȽϽ��
			matcher.matches();
		}
		b = System.currentTimeMillis();
		System.out.println("��ʽ����" + (b - a));

	}
}
