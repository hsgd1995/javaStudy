package com.entor.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 利用map实现：统计数组{1,3,8,2,3,7,1}中每个元素出现的次数，并输出重复出现的元素<br>
 * 
 * @author Administrator
 *
 */
public class TreeMapTest2 {
	public static void main(String[] args) {
		// 创建数组
		int[] arr = { 1, 3, 8, 2, 3, 7, 1 };
		// 记录次数以及次数对应的元素/记录元素以及元素对应的次数
		Map<Integer, Integer> map = new TreeMap<>();// K->元素，V->个数
		// 遍历数组，记录元素的次数
		for (int i : arr) {
			if (map.get(i) == null) {// 元素第一次出现
				map.put(i, 1);// 记一次
			} else {
				map.put(i, map.get(i) + 1);// 增加1次
			}
		}
		// 遍历集合，输出重复元素
		Set<Integer> keySet = map.keySet();
		for (Integer integer : keySet) {
			if (map.get(integer) >= 2) {
				System.out.println("数字：" + integer + "重复出现：" + map.get(integer));
			}
		}
		System.out.println(map);
	}
}
