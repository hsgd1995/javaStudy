package com.entor.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 映射<br>
 * 哈希Map是基于Hash表的单项链表<br>
 * 哈希码由key计算出来的特殊值<br>
 * map中key不可以重复的
 * 
 * @author Administrator
 *
 */
public class HashMapTest {
	public static void main(String[] args) {
		// 构造器
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "张三");
		map.put(2, "李四");
		map.put(9, "AK");
		map.put(4, "awp");
		map.put(3, "张三");
		map.put(3, "王五");// 查找3对应的节点，将节点的旧值替换为新的值，返回旧值
		System.out.println(map);
		
		// map通过key获得value
		System.out.println(map.get(3));
		System.out.println(map.get(123));
		
		// 通过map获得所有的key
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		for(Iterator<Integer> it = keySet.iterator();it.hasNext();){
			System.out.println(it.next());
		}
		// 通过map获得所有的value
		Collection<String> values = map.values();
		for(Iterator<String> it = values.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}
}
