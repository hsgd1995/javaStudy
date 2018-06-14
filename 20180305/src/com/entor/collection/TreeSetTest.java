package com.entor.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		// 底层采用TreeMap实现
		Set<UserInfo> set2 = new TreeSet<>();
		set2.add(new UserInfo(8, "张三"));
		set2.add(new UserInfo(2, "李四"));
		set2.add(new UserInfo(3, "王武"));
		set2.add(new UserInfo(7, "六七"));
		set2.add(new UserInfo(1, "胡巴"));
		set2.add(new UserInfo(5, "胡巴"));
		System.out.println(set2);
	}
}
