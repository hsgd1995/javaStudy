package com.entor.variable;

import java.util.Scanner;

/**
 * 变量作用域
 * 
 * @author Administrator
 *
 */
public class ScannerTest {
	private static Scanner sc = new Scanner(System.in);
	public void input() {
		// 录入5个人的成绩
		for (int i = 1; i <= 5; i++) {
			System.out.println("请输入第" + i + "个成绩：");
			System.out.println(sc.nextDouble());
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			ScannerTest test = new ScannerTest();
			test.input();
		}
	}
}
