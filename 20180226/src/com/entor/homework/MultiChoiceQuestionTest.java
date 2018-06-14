package com.entor.homework;

import java.util.Scanner;

/**
 * ���������
 * 
 * @author Administrator
 *
 */
public class MultiChoiceQuestionTest {
	public static void main(String[] args) {
		// 1.������ѡ��
		String text = "1.����˵��������ǣ�����ѡ��";
		String[] options = new String[4];
		options[0] = "A.Java��������������ڲ���ϵͳ";
		options[1] = "B.Java���������ı������";
		options[2] = "C.Java��������̵ı������";
		options[3] = "D.Java��������ж�����ƽ̨";
		char[] answer = { 'A', 'C' };
		MultiChoiceQuestion question = new MultiChoiceQuestion(text, options, answer);
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
		char[] input_answer = input.toCharArray();
		// 4.��֤�û��𰸣���������
		if (question.check(input_answer)) {
			System.out.println("��ϲ�㣬����ˣ�");
		} else {
			System.out.println("�����ˣ�");
		}
	}
}
