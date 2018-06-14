package com.entor.practice1;

/**
 * 12.判断一个八进制数是多少位数（int范围内）
 * 
 * @author Administrator
 *
 */
public class PracticeTest2 {
	public static void main(String[] args) {
		int num = 01234567;// 8进制数1234567
		int count = 0;// 记录除以8的次数
		int temp = num;// temp作为操作数
		while (true) {
			count++;
			if (temp / 8 == 0) {
				break;
			} else {
				temp /= 8;
			}
		}
		System.out.println(num + "是" + count + "位数！");
	}
}
