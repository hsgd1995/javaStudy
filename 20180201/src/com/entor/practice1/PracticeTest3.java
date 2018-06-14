package com.entor.practice1;

/**
 * 13.为指定成绩加分，直到分数大于等于 60 为止，输出加分前和加分后的成绩，并统计加分的次数
 * 
 * @author Administrator
 *
 */
public class PracticeTest3 {
	public static void main(String[] args) {
		int score = 53;// 53分加到60分，加了7次，每次加1分
		int count = 0;// 统计加法次数
		int temp = score;// temp作为操作数
		while (true) {
			if (temp == 60) {
				break;
			}
			temp++;
			count++;
		}
		System.out.println("加分前：" + score);
		System.out.println("加分后：" + temp);
		System.out.println("共加：" + count + "次！");
	}
}
