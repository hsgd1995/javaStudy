package com.entor.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * set集合，数学set集合的抽象<br>
 * HashSet，set实现类，它不保证 set 的迭代顺序；特别是它不保证该顺序恒久不变。此类允许使用 null 元素。
 * 
 * @author Administrator
 *
 */
public class HashSetTest {
	public static void main(String[] args) {
		// 构造器
		HashSet set = new HashSet();
		set.add("bbb");
		set.add("aaa");
		set.add("ccc");
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("bbb"));
		System.out.println(set.isEmpty());
		System.out.println(set.remove("aaa"));
		for(Iterator it = set.iterator(); it.hasNext();){
			System.out.println(it.next());
		}
		set.clear();
	}
}
