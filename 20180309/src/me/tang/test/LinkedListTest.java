package me.tang.test;

import java.util.LinkedList;

/**
 * LinkedList��ʹ��LinkedListʵ�ֶ��У��ṩ��ӣ�public void in(Object object)����<br>
 * ���ӣ�public Object out()����<br>
 * �ж϶����Ƿ�Ϊ�գ�public boolean isEmpty()������������
 * 
 * @author Administrator
 *
 */
public class LinkedListTest {
	LinkedList linkedList = new LinkedList<>();

	/**
	 * ���
	 * 
	 * @param object
	 */
	public void in(Object object) {
		// �����ĩβ���Ԫ��
		linkedList.addLast(object);
		System.out.println(object + "�����");
	}

	/**
	 * ����
	 * 
	 * @return
	 */
	public Object out() {
		// �Ƴ������ص�һ��Ԫ��
		Object object = linkedList.poll();
		System.out.println(object + "�ѳ���");
		return object;

	}

	/**
	 * �ж϶����Ƿ�Ϊ��
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		// ������Ϊ���򷵻�true
		return linkedList.isEmpty();

	}

	public static void main(String[] args) {
		// ��������
		LinkedListTest l = new LinkedListTest();
		// ���
		l.in("����");
		l.in("����");
		// ����
		l.out();
		l.out();
		// �ж��Ƿ�Ϊ��
		if (l.isEmpty()) {
			System.out.println("����Ϊ��");
		} else {
			System.out.println("���в�Ϊ��");
		}
	}

}
