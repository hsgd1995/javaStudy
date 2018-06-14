package com.entor.array;

/**
 * 数组的定义和使用
 * 
 * @author Administrator
 *
 */
public class ArrayTest {
	public static void main(String[] args) {
		int[] ints = { 1, 2, 3 };
		boolean[] boos = { false, true, false };
		String[] strs = { "123", "你我他", "AbC" };
		System.out.println("数组ints的长度：" + ints.length);
		System.out.println("数组boos第一个元素：" + boos[0]);
		System.out.println("strs最后一个元素：" + strs[strs.length - 1]);
	}
}
