package com.entor.array;

import java.util.Arrays;

/**
 * 
 * 假设有10只鸽子9只笼子，这些鸽子随机飞向笼子，那么，至少有1只笼子中有两只或以上的鸽子。<br>
 * 哪只笼子中有哪些鸽子？
 * 
 * @author Administrator
 *
 */
public class ArrayTest11 {
	public static void main(String[] args) {
		// 给笼子和鸽子编号
		int[] nest = new int[9];// 数组索引当作笼子的编号，元素当作每只笼子的鸽子数量【0，8】
		int[] pigeon = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// [0,9]
		// 模拟鸽子飞向笼子的过程
		// 每次哪只鸽子飞向哪只笼子
		// 笼子号随机，总共飞10次
		// 假设鸽子从1号开始起飞
		for (int i = 0; i < pigeon.length; i++) {
			int n_index = (int) (Math.random() * 9);// [0,8]
			System.out.println(pigeon[i] + "号鸽子飞向了" + n_index + "号笼子");
			nest[n_index]++;
		}
		// 输出笼子中鸽子的情况
		System.out.println(Arrays.toString(nest));
	}
}
