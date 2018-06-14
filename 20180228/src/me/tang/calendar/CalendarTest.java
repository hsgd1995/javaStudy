package me.tang.calendar;

import java.util.Calendar;
import java.util.Scanner;

/**
 * ��ӡ���� �������ꡢ�£���ӡ�����µ�����ͼ
 * 
 * @author Administrator
 *
 */
public class CalendarTest {

	public static void main(String[] args) {
		// ��������
		System.out.println("��������ݣ�");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		System.out.println("�������·ݣ�");
		int month = scanner.nextInt();
		System.out.println("������꣬��Ϊ��" + year + " " + month);

		// �����������������Calendar
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);
		// ��������Ϊ1�ţ�1��Ϊ��һ�죬�����ڻ�ȡ�����������ڼ�ʱ���Ի�ȡ�����µĵ�һ�������ڼ�
		c.set(Calendar.DAY_OF_MONTH, 1);

		// ��ȡ���µ�һ�������ڼ�
		int firstDayOfWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
		System.out.println("���µ�һ�������ڣ�" + firstDayOfWeek);
		// ��ȡ���µ�����
		int countDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("������" + countDayOfMonth + "��");
		// ��ӡ��������ͷ��
		System.out.println("������\t" + "����һ\t" + "���ڶ�\t" + "������\t" + "������\t" + "������\t" + "������\t");
		
		// ��ӡ��
		for (int j = 1; j <= countDayOfMonth; j++) {
			// ��ӡ�������ϸ��µ�1�ŵ�ǰ���ж��ٸ���λ
			if(j==1){
				for(int k =0;k<firstDayOfWeek;k++){
					System.out.print("\t");
				}
			}
			System.out.print("  "+j+"\t");
			// �������������Ӧ���У���������������������ʱӦ��ÿ�е�����ࣩ
			if ((j + firstDayOfWeek) % 7 == 0 && (j + firstDayOfWeek)>=7) {
				System.out.println();
			} 
		}
	}

}
