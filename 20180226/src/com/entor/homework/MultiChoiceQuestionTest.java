package com.entor.homework;

import java.util.Scanner;

/**
 * 考题测试类
 * 
 * @author Administrator
 *
 */
public class MultiChoiceQuestionTest {
	public static void main(String[] args) {
		// 1.创建多选题
		String text = "1.以下说法错误的是：（多选）";
		String[] options = new String[4];
		options[0] = "A.Java程序的运行依赖于操作系统";
		options[1] = "B.Java是面向对象的编程语言";
		options[2] = "C.Java是面向过程的编程语言";
		options[3] = "D.Java程序的运行独立于平台";
		char[] answer = { 'A', 'C' };
		MultiChoiceQuestion question = new MultiChoiceQuestion(text, options, answer);
		// 2.输出多选题
		System.out.println(question.getText());
		for (String op : options) {
			System.out.print(op + "\t");
		}
		System.out.println();// 换行
		// 3.用户输入答案
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入答案：");
		String input = sc.nextLine().toUpperCase();
		char[] input_answer = input.toCharArray();
		// 4.验证用户答案，并输出结果
		if (question.check(input_answer)) {
			System.out.println("恭喜你，答对了！");
		} else {
			System.out.println("你答错了！");
		}
	}
}
