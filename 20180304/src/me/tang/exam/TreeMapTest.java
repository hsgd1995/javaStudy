package me.tang.exam;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		int arr[] = { 1, 2, 3, 3, 5, 6, 4, 2, 3, 5 };
		for (int i : arr) {
			if (treeMap.get(i) == null) {
				treeMap.put(i, 1);
			} else {
				treeMap.put(i, treeMap.get(i) + 1);
			}
		}
		Set<Integer> set = treeMap.keySet();
		for (Integer integer : set) {
			System.out.println(treeMap.get(integer));
		}
		int index = 0;
		Object[] obj = new Object[treeMap.size()];
		for (Integer integer : set) {
			Integer[] i = new Integer[2];
			i[0] = integer;
			i[1] = treeMap.get(integer);
			obj[index] = i;
			index++;
		}

		// Ã°ÅİÅÅĞò
		for (int i = 0; i < obj.length - 1; i++) {
			System.out.println("((Integer[]) obj[j]"+((Integer[]) obj[i])[0]);
			for (int j = 0; j < obj.length - i - 1; j++) {
				if (((Integer[]) obj[j])[1] > ((Integer[]) obj[j + 1])[1]) {
					Object temp = obj[j];
					obj[j] = obj[j + 1];
					obj[j + 1] = temp;
				}
			}
		}
		for (Object object : obj) {
			Integer[] ints = (Integer[]) object;
			System.out.println(ints[0] + ":" + ints[1]);
		}

	}

}
