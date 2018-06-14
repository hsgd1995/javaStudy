package com.entor.array;

/**
 * java班有5个学生，成绩分别为77，88，99，61.5，73， 请用数组保存这些数据，并输出第四个学生的成绩。
 * 
 * @author Administrator
 *
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		// 考虑到成绩类型，数组的元素类型应该是浮点型
		double[] scores = { 77, 88, 99, 61.5, 73 };
		// 输出第四个学生元素
		System.out.println("第四个学生成绩：" + scores[3]);

		// 输出所有学生的成绩
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);

		// 解决重复问题，采用循环
		int index = 0;
		while (index < scores.length) {
			System.out.println(scores[index]);
			index++;
		}
	}
}
