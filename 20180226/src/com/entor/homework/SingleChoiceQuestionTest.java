package com.entor.homework;

import java.util.Scanner;

/**
 * ���������
 * 
 * @author Administrator
 *
 */
public class SingleChoiceQuestionTest {
	public static void main(String[] args) {
		// 1.������ѡ��
		String text = "1.�����ľ�ʫ��\"���κ�����\"���ϰ�䣿";
		String[] options = new String[4];
		options[0] = "A.����������";
		options[1] = "B.˭֪���в�";
		options[2] = "C.�����յ���";
		options[3] = "D.��ǰ���¹�";
		char answer = 'C';
		SingleChoiceQuestion question = new SingleChoiceQuestion(text, options, answer);
		// 2.�����ѡ��
		System.out.println(question.getText());
		for (String op : options) {
			System.out.print(op + "\t");
		}
		System.out.println();// ����
		// 3.�û������
		Scanner sc = new Scanner(System.in);
		System.out.println("������𰸣�");
		String input = sc.nextLine().toUpperCase();
		char input_answer = input.charAt(0);
		// 4.��֤�û��𰸣���������
		if (question.check(new char[] { input_answer })) {
			System.out.println("��ϲ�㣬����ˣ�");
		} else {
			System.out.println("�����ˣ�");
		}
	}
}
