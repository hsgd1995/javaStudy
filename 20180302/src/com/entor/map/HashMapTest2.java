package com.entor.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 利用map实现：统计数组{1,3,8,2,3,7,1}中每个元素出现的次数，并输出重复出现的元素<br>
 * 请按照出现次数从小到大的顺序输出所有元素
 * 
 * @author Administrator
 *
 */
public class HashMapTest2 {
	public static void main(String[] args) {
		// 创建数组
		int[] arr = { 1, 3, 8, 2, 3, 7, 1 };
		// 记录次数以及次数对应的元素/记录元素以及元素对应的次数
		Map<Integer, Integer> map = new HashMap<>();// K->元素，V->个数
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
		// 根据次数，对元素进行排序，并输出
		// 根据V排序，显示K
		Object[] objs = new Object[map.size()];
		int index = 0;
		for (Integer integer : keySet) {
			Integer[] ints = new Integer[2];
			ints[0] = integer;
			ints[1] = map.get(integer);
			objs[index] = ints;
			index++;
		}
		// 冒泡排序
		for (int i = 0; i < objs.length - 1; i++) {
			for (int j = 0; j < objs.length - i - 1; j++) {
				if (((Integer[]) objs[j])[1] > ((Integer[]) objs[j + 1])[1]) {
					Object temp = objs[j];
					objs[j] = objs[j + 1];
					objs[j + 1] = temp;
				}
			}
		}
		// 输出
		System.out.println("按照顺序打印元素和次数：");
		for (Object object : objs) {
			Integer[] ints = (Integer[]) object;
			System.out.println(ints[0] + ":" + ints[1]);
		}
	}
}
