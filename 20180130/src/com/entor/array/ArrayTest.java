package com.entor.array;

/**
 * ����Ķ����ʹ��
 * 
 * @author Administrator
 *
 */
public class ArrayTest {
	public static void main(String[] args) {
		int[] ints = { 1, 2, 3 };
		boolean[] boos = { false, true, false };
		String[] strs = { "123", "������", "AbC" };
		System.out.println("����ints�ĳ��ȣ�" + ints.length);
		System.out.println("����boos��һ��Ԫ�أ�" + boos[0]);
		System.out.println("strs���һ��Ԫ�أ�" + strs[strs.length - 1]);
	}
}
