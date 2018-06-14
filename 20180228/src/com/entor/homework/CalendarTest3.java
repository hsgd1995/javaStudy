package com.entor.homework;

import java.util.Calendar;
import java.util.Scanner;

/**
 * ����ָ�������£�������¶�Ӧ������ͼ�����ں��ܣ�
 * 
 * @author Administrator
 *
 */
public class CalendarTest3 {
	public static void main(String[] args) {
		// ����week��API
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));// ��ǰ�����ڵ�ǰ�·��е��ܵ�����
		System.out.println(c.getFirstDayOfWeek());// ���ڵĵ�һ��
		System.out.println(c.getMinimalDaysInFirstWeek());
		System.out.println(c.get(Calendar.MONDAY));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));

		// ������ݺ��·�
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();
		System.out.println("�������·ݣ�");
		int month = sc.nextInt();
		// ������������´���Calendar����
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month-1);
		calendar.set(Calendar.DATE, 1);
		// �������ǰ�·ݵĵ�һ�����ڣ�
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		// ��õ�ǰ�·ݵ�����
		int maxDaysOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		// ����һ��7��͵�ǰ�·ݵ�����������������ͼ
		System.out.println("һ\t��\t��\t��\t��\t��\t��\t");
		for(int each = 1; each <= maxDaysOfMonth; each++){
			if(each == 1){
				for(int i = 1; i <= dayOfWeek - 1; i++){
					System.out.print("\t");
				}
			}
			System.out.print(each + "\t");
			if((dayOfWeek + each - 1) % 7 == 0){
				System.out.println();
			}
		}
	}
}
