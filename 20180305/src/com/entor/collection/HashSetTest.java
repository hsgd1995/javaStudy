package com.entor.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Set是数学意义上的集合的抽象
 * 
 * @author Administrator
 *
 */
public class HashSetTest {
	public static void main(String[] args) {
		// 默认构造器，hashset底层维护了一个hashmap
		// hashmap有两个部分：K和V
		// hashmap将set的元素作为K，用一个无意义的常量Object实例作为V
		HashSet<String> set = new HashSet<>();
		System.out.println(set.add("a"));
		System.out.println(set.add("c"));
		System.out.println(set.add("d"));
		System.out.println(set.add("b"));
		System.out.println(set.add("a"));
		System.out.println(set);

		// 迭代set，将底层hashmap的K的迭代器返回
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		HashSet<UserInfo> set2 = new HashSet<>();
		set2.add(new UserInfo(8, "张三"));
		set2.add(new UserInfo(2, "李四"));
		set2.add(new UserInfo(3, "王武"));
		set2.add(new UserInfo(7, "六七"));
		set2.add(new UserInfo(1, "胡巴"));
		System.out.println(set2);
	}
}
