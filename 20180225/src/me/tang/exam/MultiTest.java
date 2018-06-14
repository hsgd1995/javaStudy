package me.tang.exam;

import java.util.Scanner;

public class MultiTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MultiChoice m = new MultiChoice("以下选项正确的是：", new String[]{ "A:1+1=2", "B:1+2=3", "C:2+2=4", "D:2+2=5" },new char[]{'A','B','C'});
		System.out.println("请做下面多选题：");
		System.out.println(m.getText().toString());
		for (int i = 0; i < m.getOptions().length; i++) {
			System.out.print(m.getOptions()[i] + "   ");
		}
		System.out.println("");
		System.out.println("请输入正确答案：");
		Scanner scanner = new Scanner(System.in);
		char[] answer = scanner.nextLine().trim().toUpperCase().toCharArray();
		//调用多选题检验正确答案的方法
		if (m.check(answer)) {
			System.out.println("回答正确！");
		} else {
			System.out.println("回答错误！");
		}
	}

}
