package com.entor.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Set����ѧ�����ϵļ��ϵĳ���
 * 
 * @author Administrator
 *
 */
public class HashSetTest {
	public static void main(String[] args) {
		// Ĭ�Ϲ�������hashset�ײ�ά����һ��hashmap
		// hashmap���������֣�K��V
		// hashmap��set��Ԫ����ΪK����һ��������ĳ���Objectʵ����ΪV
		HashSet<String> set = new HashSet<>();
		System.out.println(set.add("a"));
		System.out.println(set.add("c"));
		System.out.println(set.add("d"));
		System.out.println(set.add("b"));
		System.out.println(set.add("a"));
		System.out.println(set);

		// ����set�����ײ�hashmap��K�ĵ���������
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		HashSet<UserInfo> set2 = new HashSet<>();
		set2.add(new UserInfo(8, "����"));
		set2.add(new UserInfo(2, "����"));
		set2.add(new UserInfo(3, "����"));
		set2.add(new UserInfo(7, "����"));
		set2.add(new UserInfo(1, "����"));
		System.out.println(set2);
	}
}
