package com.entor.array;

/**
 * 
 * java班有5个学生成绩分别为：66，77，88，99，55；请计算出他们的总成绩和平均成绩并输出；
 * 
 * @author Administrator
 *
 */
public class ArrayTest9 {
	public static void main(String[] args) {
		// 创建数组
		double[] array = { 66, 77, 88, 99, 55 };
		// 加和所有的成绩
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		// 输出
		System.out.println("成绩总和：" + sum);
		System.out.println("平均成绩：" + (sum / array.length));
	}
}
