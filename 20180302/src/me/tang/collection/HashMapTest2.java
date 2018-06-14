package me.tang.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 利用map实现统计数组{1,3,8,2,3,7,1}中每个元素出现的次数，并输出重复出现的元素
 * 
 * @author Administrator
 *
 */
public class HashMapTest2 {

	public static void repect() {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 3);
		map.put(3, 8);
		map.put(4, 2);
		map.put(5, 3);
		map.put(6, 7);
		map.put(7, 1);
		int count = 0;
		Map<Integer, Integer> result = new HashMap<>();
		int size = map.size();
		for (int i = 1; i < map.size() + 1; i++) {
			count++;
			for (int j = 1; j < map.size(); j++) {
				if (map.get(i) == map.get(j + i) && (j + i) <= map.size()) {
					count++;
					// map.remove(j+i);
				}
			}
			if (map.get(i) != null && !result.containsKey(map.get(i))) {
				result.put(map.get(i), count);
			}
			count = 0;
		}
		Set<Integer> keySet = result.keySet();
		for (Integer integer : keySet) {
			if (result.get(integer) >= 2) {
				System.out.println("数字：" + integer + "重复出现：" + result.get(integer) + "次");
			}
		}

	}

	public static void repect2() {
		int[] arr = { 1, 3, 8, 2, 3, 7, 1 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			if (map.get(i) == null) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}
		Set<Integer> keySet = map.keySet();
		for (Integer integer : keySet) {
			if (map.get(integer) >= 2) {
				System.out.println("数字：" + integer + "重复出现：" + map.get(integer) + "次");
			}
		}
	}

	public static void main(String[] args) {
		repect2();
	}

}
