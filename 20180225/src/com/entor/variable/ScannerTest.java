package com.entor.variable;

import java.util.Scanner;

/**
 * ����������
 * 
 * @author Administrator
 *
 */
public class ScannerTest {
	private static Scanner sc = new Scanner(System.in);
	public void input() {
		// ¼��5���˵ĳɼ�
		for (int i = 1; i <= 5; i++) {
			System.out.println("�������" + i + "���ɼ���");
			System.out.println(sc.nextDouble());
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			ScannerTest test = new ScannerTest();
			test.input();
		}
	}
}
