package com.entor.practice1;

import java.util.Scanner;

/**
 * 扫描器：java.util.Scanner
 * 
 * @author Administrator
 *
 */
public class MyScanner {
	public static void main(String[] args) {
		// 创建扫描器对象
		Scanner sc = new Scanner(System.in);
		// 提示：
		System.out.println("请输入字母或文字：");
		// 接收输入信息
		String message = sc.next();
		System.out.println(message);
		// 提示：
		System.out.println("请输入整数：");
		// 接收输入信息
		int int1 = sc.nextInt();
		System.out.println(int1);
		// 提示：
		System.out.println("请输入小数：");
		// 接收输入信息
		double dou = sc.nextDouble();
		System.out.println(dou);
	}
}
