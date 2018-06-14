package me.tang.collection;

import java.util.ArrayList;

/**
 * arrayList ������
 * 
 * @author Administrator
 *
 */
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		aList.add(3);
		aList.add(4.0);
		aList.add("abc");
		aList.add(new Exception("hello world"));
		aList.add(new String[] { "e", "f", "g" });
		System.out.println(aList);
		System.out.println(aList.size());
		Object obj = aList.get(2);
		System.out.println(obj);
		aList.ensureCapacity(20);
		aList.add(3, new RuntimeException("�����쳣"));
		System.out.println("���Ӻ�");
		for (Object object : aList) {
			System.out.println(object);
		}
		aList.set(4, "test");
		aList.remove(0);
		aList.remove(new String("abc"));
		System.out.println("�޸ġ�ɾ����");
		for (Object object : aList) {
			System.out.println(object);
		}

		System.out.println(aList.contains(4.0));
		int index = aList.indexOf(4.0);
		System.out.println(index);

		aList.clear();
		System.out.println("��պ�");
		System.out.println(aList);
		System.out.println(aList.isEmpty());

	}

}
