package com.entor.collection;

import java.util.LinkedList;

/**
 * ����
 * 
 * @author Administrator
 *
 */
public class LinkedListTest {
	public static void main(String[] args) {
		// ������
		LinkedList list = new LinkedList();
		list.add(1);// �ڼ��ϵĵ�һ��λ�÷���1
		list.add(1.1);
		list.add("123");
		list.add(new Exception("�ٺٺ�"));
		list.add(new int[] { 1, 2, 3, 4 });
		list.add(null);
		System.out.println(list);
		System.out.println(list.size());

		System.out.println(list.get(2));

		list.add(1, 1.2);// ����

		list.remove(2);
		System.out.println(list);

		list.remove(new Integer(1));// ����Ԫ�ر���ɾ��
		System.out.println(list);

		int index = list.indexOf(1.2);// ���ҵ�һ�γ���Ԫ�ص�����
		System.out.println(index);

		boolean isExist = list.contains(1.2);
		System.out.println(isExist);

		Object obj = list.set(1, 999);// �滻
		System.out.println(list.get(1) + "<==>" + obj);

		System.out.println(list.isEmpty());

		Object[] objs = list.toArray();// ��ÿ���ڵ�����ݲ����浽����Ϊsize��������
		for (Object object : objs) {
			System.out.println(object);
		}

		System.out.println(list.getFirst());
		list.offer(220);
		System.out.println(list.getLast());
		list.offerFirst(110);
		list.offerLast(120);
		System.out.println(list);
		
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		System.out.println(list.pop());// ����ջ��Ԫ��
		System.out.println(list);
		list.push(119);
		System.out.println(list);
		
		list.clear();// ����ڵ�֮������ӣ����ݲ�������׽ڵ��β�ڵ�����Ϊnull
		System.out.println(list);
	}
}
