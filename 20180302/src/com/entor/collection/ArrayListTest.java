package com.entor.collection;

import java.util.ArrayList;

/**
 * �ɱ��С������
 * 
 * @author Administrator
 *
 */
public class ArrayListTest {
	public static void aaa(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		// ������
		ArrayList list = new ArrayList();// �ײ㣺this.elementData = {};
		
		// ���÷���
		list.add(1);// �ڼ��ϵĵ�һ��λ�÷���1
		list.add(1.1);
		list.add("123");
		list.add(new Exception("�ٺٺ�"));
		list.add(new int[] { 1, 2, 3, 4 });
		list.add(null);
		System.out.println(list);
		System.out.println(list.size());
		
		Object obj = list.get(3);// this.elementData[3]
		System.out.println(obj);
		
		list.ensureCapacity(20);// �����ϵ������޸ĳ�20����ԭ�е�Ԫ�ذ���˳������������У�����Ŀռ���ȱʡֵ��ֵ
		list.ensureCapacity(1);// ��Ϊ��ǰ��������1���޸�ʧ��
		
		list.add(1, 1.2);// ����
		
		obj = list.remove(3);// ��������ɾ��
		System.out.println(obj);
		
		list.remove(new Integer(1));// ����Ԫ�ر���ɾ��
		System.out.println(list);

		int index = list.indexOf(1.2);
		System.out.println(index);
		
		boolean isExist = list.contains(1.2);
		System.out.println(isExist);
		
		obj = list.set(1, 999);// �滻
		System.out.println(list.get(1) + "<==>" + obj);
		
		System.out.println(list.isEmpty());
		
		Object[] objs = list.toArray();// ���ײ��������ЧԪ�ظ��Ƶ��µ�����
		for (Object object : objs) {
			System.out.println(object);
		}
		
		list.clear();// ��Ԫ�ض���ȱʡֵ�滻������size����Ϊ0
		System.out.println(list);
	}
}
