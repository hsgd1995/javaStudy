package com.entor.practice1;

import java.util.Scanner;

/**
 * ɨ������java.util.Scanner
 * 
 * @author Administrator
 *
 */
public class MyScanner {
	public static void main(String[] args) {
		// ����ɨ��������
		Scanner sc = new Scanner(System.in);
		// ��ʾ��
		System.out.println("��������ĸ�����֣�");
		// ����������Ϣ
		String message = sc.next();
		System.out.println(message);
		// ��ʾ��
		System.out.println("������������");
		// ����������Ϣ
		int int1 = sc.nextInt();
		System.out.println(int1);
		// ��ʾ��
		System.out.println("������С����");
		// ����������Ϣ
		double dou = sc.nextDouble();
		System.out.println(dou);
	}
}
