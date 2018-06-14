package com.entor.practices;

import java.util.Scanner;

/**
 * ������ʵ��<br>
 * 
 * �ټ���1�������ģ�2�����壬3��������4�����죬5����һ��6���ܶ���7��������8�ջص�����<br>
 * 7����һ�ܣ�����1����һ��6���������˴�Ӧ���л��У�ÿ����������Ҫ���У�13��20��27����Ҫ���У����ɣ�����n������һ��(n + 1) % 7 ==
 * 0���У����n������m��(n + m ) % 7 == 0<br>
 * �ڲ���1900��1��1�գ�����һ����Ϊ���������<br>
 * �������꣺���·ݶ�1�죬29��<br>
 * ���������ݵĸ����·ݵ�1�����ܼ�?(1 + m ) % 7 == 0<br>
 * 1900��2��1������ʼʱ����31�գ�31 % 7 = 3������2��1�����ܣ�3 + 1���ģ� 1900��3��1������ʵʱ����31��+28�գ�ƽ�꣩
 * = 59 % 7 = 3������3��1�����ܣ�3 + 1���ģ� ָ��������1����1900��1��1�յ�ʱ������������
 * 
 * @author Administrator
 *
 */
public class PracticeTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();
		System.out.println("�������·ݣ�");
		int month = sc.nextInt();

		// 1900��1��1�յ�����1��֮�������
		int daysFrom1900ToNow = 0;

		// 1900��1��1��������һ
		// 1900���1��1����ָ�������һ��������
		int daysFrom1900ToPreYear = 0;
		for (int x = year - 1; x >= 1990; x--) {
			if (x % 400 == 0 || (x % 100 != 0 && x % 4 == 0)) {
				daysFrom1900ToPreYear += 366;
			} else {
				daysFrom1900ToPreYear += 365;
			}
		}

		daysFrom1900ToNow += daysFrom1900ToPreYear;

		// �ж�����
		boolean isLeapYear = false;
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			isLeapYear = true;
		}

		// ��ǰ��ݵ�����֮ǰ������
		int daysOfThisMonth = 0;
		for (int y = month; y >= 1; y--) {
			// �ж��·ݣ�����ֻ�ж��·ݻ��ܵ������Ӱ��
			int daysOfMonth = 0;
			switch (y) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				daysOfMonth = 31;
				break;
			case 2:
				if (isLeapYear) {
					daysOfMonth = 29;
				} else {
					daysOfMonth = 28;
				}
				break;
			default:
				daysOfMonth = 30;
				break;
			}
			// ����ǵ�ǰ�·ݣ�ֻ�Ǽ�¼���µ�ǰ�·ݵ��������������뵽�������ļ���
			if (y == month) {
				daysOfThisMonth = daysOfMonth;
				continue;
			}
			daysFrom1900ToNow += daysOfMonth;
		}

		// �������μ��㣺���赱ǰ��2018��10�£���ô�������� = 1900��1��1�յ�2017��12��31�յ����� +
		// 2018��1��1�յ�2018��9��30�յ�����

		// 1900��1��1��������һ
		// ����1�����ڼ�
		int start = daysFrom1900ToNow % 7 + 1;
		System.out.println(year + "��" + month + "��1�����ڣ�" + start);
		System.out.println(year + "��" + month + "�¹���" + daysOfThisMonth + "��");

		// �������
		System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");
		for (int i = 1; i <= start; i++) {
			System.out.print("\t");
		}
		for (int j = 1; j <= daysOfThisMonth; j++) {
			if ((j + start) % 7 == 1) {// ��1�ſ�ʼ���������������
				System.out.print("\n" + j + "\t");
			} else {
				System.out.print(j + "\t");
			}
		}
	}
}
