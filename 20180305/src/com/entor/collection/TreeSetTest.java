package com.entor.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		// �ײ����TreeMapʵ��
		Set<UserInfo> set2 = new TreeSet<>();
		set2.add(new UserInfo(8, "����"));
		set2.add(new UserInfo(2, "����"));
		set2.add(new UserInfo(3, "����"));
		set2.add(new UserInfo(7, "����"));
		set2.add(new UserInfo(1, "����"));
		set2.add(new UserInfo(5, "����"));
		System.out.println(set2);
	}
}
