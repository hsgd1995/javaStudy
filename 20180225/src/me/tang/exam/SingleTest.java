package me.tang.exam;

import java.util.Scanner;

public class SingleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 单选题
		SingleChoice s = new SingleChoice("1+1=?", new String[]{ "A:1", "B:2", "C:3", "D:4" }, 'B');
		System.out.println("请做下面单选题：");
		System.out.println(s.getText().toString());
		for (int i = 0; i < s.getOptions().length; i++) {
			System.out.print(s.getOptions()[i] + "   ");
		}
		System.out.println("");
		System.out.println("请输入正确答案：");
		Scanner scanner = new Scanner(System.in);
		char[] answer = scanner.nextLine().trim().toUpperCase().toCharArray();
		//调用单选题检验正确答案的方法
		if (s.check(answer)) {
			System.out.println("回答正确！");
		} else {
			System.out.println("回答错误！");
		}

	}
}
