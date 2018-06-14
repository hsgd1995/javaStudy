package com.entor.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 迭代器
 * 
 * @author Administrator
 *
 */
public class IteratorTest {
	public static void main(String[] args) {
		// 创建list
		ArrayList list = new ArrayList();
		list.add("123");
		list.add("321");
		list.add("222");
		for(int index = 0; index<list.size();index++){
			System.out.println(list.get(index));
		}
		Iterator it = list.iterator();
		while(it.hasNext()){// 遍历集合元素的条件
			System.out.println(it.next());// 取得集合元素
		}
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
