package com.entor.practice1;

/**
 * 12.判断一个数（小于10位）的位数。例：输入999，则输出 “它是个3位的数！”
 * 
 * @author Administrator
 *
 */
public class PracticeTest {
	public static void main(String[] args) {
		int num = 123456789;
		int count = 0;// 记录除以10的次数
		int temp = num;// temp作为操作数
		while (true) {
			count++;
			if (temp / 10 == 0) {
				break;
			} else {
				temp /= 10;
			}
		}
		System.out.println(num + "是" + count + "位数！");
	}
}
