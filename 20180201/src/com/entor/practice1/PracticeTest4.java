package com.entor.practice1;

import java.util.Scanner;

/**
 * ʵ�ֽ��������༶�ĸ�����ѧԱ�ĳɼ���Ϣ��Ȼ�����ÿ���༶ѧԱ��ƽ����
 * 
 * @author Administrator
 *
 */
public class PracticeTest4 {
	public static void main(String[] args) {
		for (int j = 1; j < 4; j++) {
			System.out.println("��¼���" + j + "���༶�ĳɼ���");
			// 1��4��ѧ���ĳɼ����浽������
			double[] classes = new double[4];
			// ѭ�����飬����ɼ��������浽������
			Scanner sc = new Scanner(System.in);
			double sum = 0;
			for (int i = 0; i < classes.length; i++) {
				// ��ʾ
				System.out.println("¼���" + (i + 1) + "��ѧ���ĳɼ���");
				classes[i] = sc.nextDouble();
				sum += classes[i];
			}
			System.out.println("class" + j + "�༶��ƽ���֣�" + sum / classes.length);
		}
	}
}
