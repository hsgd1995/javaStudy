package me.tang.exam;

import java.util.Scanner;

public class SingleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��ѡ��
		SingleChoice s = new SingleChoice("1+1=?", new String[]{ "A:1", "B:2", "C:3", "D:4" }, 'B');
		System.out.println("�������浥ѡ�⣺");
		System.out.println(s.getText().toString());
		for (int i = 0; i < s.getOptions().length; i++) {
			System.out.print(s.getOptions()[i] + "   ");
		}
		System.out.println("");
		System.out.println("��������ȷ�𰸣�");
		Scanner scanner = new Scanner(System.in);
		char[] answer = scanner.nextLine().trim().toUpperCase().toCharArray();
		//���õ�ѡ�������ȷ�𰸵ķ���
		if (s.check(answer)) {
			System.out.println("�ش���ȷ��");
		} else {
			System.out.println("�ش����");
		}

	}
}
