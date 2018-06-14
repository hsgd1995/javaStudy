package com.entor.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest2 {
	public static void main(String[] args) {
		String regex = "^\\d{3,4}-\\d{7,8}$";

		// 1.方式一
		long a = System.currentTimeMillis();
		for (int i = 1; i <= 100000; i++) {
			"010-84717471".matches(regex);
		}
		long b = System.currentTimeMillis();
		System.out.println("方式一：" + (b - a));

		// 2.方式二
		// 编译正则表达式字符串，生成模式对象
		Pattern pattern = Pattern.compile(regex);
		String input = "0415-5561111";
		// 通过模式对象和待匹配的字符串，生成比较器
		Matcher matcher = pattern.matcher(input);
		a = System.currentTimeMillis();
		for (int i = 1; i <= 100000; i++) {
			// 比较字符串，获得比较结果
			matcher.matches();
		}
		b = System.currentTimeMillis();
		System.out.println("方式二：" + (b - a));

	}
}
