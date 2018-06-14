package com.entor.array;

/**
 * java班有5个学生成绩分别为：66，77，88，99，55；请找出最好成绩和最差成绩并输出；
 * 
 * @author Administrator	
 *
 */
public class ArrayTest8 {
	public static void main(String[] args) {
		// 创建数组
		int[] array = { 66, 77, 88, 99, 55 };
		// 定义变量保存最好成绩和最差成绩
		int max = array[0], min = array[0];// 假设第一个元素就是最好成绩或者最差成绩
		// 将假设的max和min与剩余的元素比较
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];// 重新赋值最好成绩
			}
			if (array[i] < min) {
				min = array[i];// 重新赋值最差成绩
			}
		}
		// 输出
		System.out.println("最好成绩：" + max);
		System.out.println("最差成绩：" + min);
	}
}
