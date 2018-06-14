package com.entor.practice1;

import java.util.Scanner;

/**
 * 实现接收三个班级的各四名学员的成绩信息，然后计算每个班级学员的平均分
 * 
 * @author Administrator
 *
 */
public class PracticeTest4 {
	public static void main(String[] args) {
		for (int j = 1; j < 4; j++) {
			System.out.println("请录入第" + j + "个班级的成绩：");
			// 1班4个学生的成绩保存到数组中
			double[] classes = new double[4];
			// 循环数组，输入成绩，并保存到数组中
			Scanner sc = new Scanner(System.in);
			double sum = 0;
			for (int i = 0; i < classes.length; i++) {
				// 提示
				System.out.println("录入第" + (i + 1) + "个学生的成绩：");
				classes[i] = sc.nextDouble();
				sum += classes[i];
			}
			System.out.println("class" + j + "班级的平均分：" + sum / classes.length);
		}
	}
}
