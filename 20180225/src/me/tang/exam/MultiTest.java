package me.tang.exam;

import java.util.Scanner;

public class MultiTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MultiChoice m = new MultiChoice("����ѡ����ȷ���ǣ�", new String[]{ "A:1+1=2", "B:1+2=3", "C:2+2=4", "D:2+2=5" },new char[]{'A','B','C'});
		System.out.println("���������ѡ�⣺");
		System.out.println(m.getText().toString());
		for (int i = 0; i < m.getOptions().length; i++) {
			System.out.print(m.getOptions()[i] + "   ");
		}
		System.out.println("");
		System.out.println("��������ȷ�𰸣�");
		Scanner scanner = new Scanner(System.in);
		char[] answer = scanner.nextLine().trim().toUpperCase().toCharArray();
		//���ö�ѡ�������ȷ�𰸵ķ���
		if (m.check(answer)) {
			System.out.println("�ش���ȷ��");
		} else {
			System.out.println("�ش����");
		}
	}

}
