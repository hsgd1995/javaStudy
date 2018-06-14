package com.entor.array;

/**
 * 
 * 从数组{8,2,3,7,1}中随机输出一个元素
 * 
 * @author Administrator
 *
 */
public class ArrayTest10 {
	public static void main(String[] args) {
		// 创建数组
		// 数字的索引是[0,4]
		int[] array = { 8, 2, 3, 7, 1 };

		// 输出随机数
		for (int i = 0; i < 10; i++) {
			// 数学随机数函数
			int index = (int) (Math.random() * 5);// [0,4]
			System.out.println("随机输出元素：" + array[index]);
		}
	}
}
