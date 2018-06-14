package com.entor.operator;

/**
 * 三目运算
 * 
 * @author Administrator
 *
 */
public class OperatorTest {
	public static void main(String[] args) {
		// 60以下不及格，60以上及格
		// 0-59 不及格，60-80及格，80-100优秀
		int score = 77;
		String r1 = score >= 60 ? "及格" : "不及格";
		System.out.println(r1);

		String r2 = score > 100 || score < 0 ? "不合理的分数" : (score >= 80 ? "优秀" : (score >= 60 ? "及格" : "不及格"));
		System.out.println(r2);
	}
}
