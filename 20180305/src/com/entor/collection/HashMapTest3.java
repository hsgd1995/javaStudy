package com.entor.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 利用map实现：统计字符串ijeojasldf;kja;sdkjf;asoifasjdf;aksdf;ha;wfihas;ldfkj中每个字符出现的次数
 * 
 * @author Administrator
 *
 */
public class HashMapTest3 {
	public static void main(String[] args) {
		String string = "ijeojasldf;kja;sdkjf;asoifasjdf;aksdf;ha;wfihas;ldfkj";
		// 创建数组
		char[] arr = string.toCharArray();
		// 记录次数以及次数对应的元素/记录元素以及元素对应的次数
		Map<Character, Integer> map = new HashMap<>();// K->元素，V->个数
		// 遍历数组，记录元素的次数
		for (char i : arr) {
			if (map.get(i) == null) {// 元素第一次出现
				map.put(i, 1);// 记一次
			} else {
				map.put(i, map.get(i) + 1);// 增加1次
			}
		}
		// 遍历集合，输出重复元素
		Set<Character> keySet = map.keySet();
		for (Character character : keySet) {
			if (map.get(character) >= 2) {
				System.out.println("数字：" + character + "重复出现：" + map.get(character));
			}
		}
	}
}
