package me.tang.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ˫ɫ��Ͷע����Ϊ��ɫ�����������ɫ�����������ɫ���������1-33����ʮ����������ɣ�<br>
 * ��ɫ���������1-16��ʮ����������ɡ�Ͷעʱѡ��6����ɫ������1����ɫ��������һע���е�ʽͶע
 * 
 * @author Administrator
 *
 */
public class LotteryTest {
	public static void main(String[] args) {
		// ��33��������ѡ��6������16��������ѡ��1������ϳ��н�����
		// ѡ��Ӧ�������
		// ��������ô��ʾ��ѡ�������ô��ƣ��н�������ô��ʾ��
		// ���鱣��������Լ��н�����
		// ѡ�񼯺����������飬��ʾÿһ�������

		// 1.�������򼯺�
		List redballs = new ArrayList();
		for (int i = 1; i <= 33; i++) {
			redballs.add(i);
		}
		System.out.println("����" + redballs);
		// 2.�������򼯺�
		List blueballs = new ArrayList();
		for (int i = 1; i <= 16; i++) {
			blueballs.add(i);
		}
		System.out.println("����" + blueballs);
		// 3.�н����뼯��
		List pools = new ArrayList();
		// 4.ѡ��
		Random random = new Random();
		for (int i = 1; i <= 6; i++) {
			int index = random.nextInt(redballs.size());
			pools.add(redballs.get(index));// ȡ����Ӧ�ĺ��򣬷ŵ�������
			redballs.remove(index);// ȡ���ĺ�����ԭ���ļ�����
		}
		int index = random.nextInt(blueballs.size());
		pools.add(blueballs.get(index));// ȡ����Ӧ�����򣬷ŵ�������
		blueballs.remove(index);// ȡ����������ԭ���ļ�����
		// 5.����н�����
		System.out.println("�����н�����\t\t\t�ر����");
		System.out.println(pools + "\t" + pools.get(pools.size() - 1));
	}
}
