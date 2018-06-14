package com.entor.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args) {
		// 1.创建正则表达式
		// ^表示正则表达式起始位置，$表示正则表达式结束位置
		String regex = "^[a-zA-Z]\\w{8,10}$";// 首字符是大小写字母，剩下8-10个数字、大小写字母和下划线组成
		// 2.创建待验证的字符串
		String dest = "A1b2c312aaa1";
		// 3.验证
		boolean result = dest.matches(regex);
		if (result) {
			System.out.println("验证通过！");
		} else {
			System.out.println("验证不通过！");
		}
		
		// 例子2
		regex = "^(\\+86|0086)?\\s?\\d{11}$";
		System.out.println("+86 13912345678".matches(regex));
		
		// 例子3
		regex = "\\d{3,4}-\\d{7,8}";
		// 编译正则表达式字符串，生成模式对象
		Pattern pattern = Pattern.compile(regex);
		String input = "0415-5561111";
		// 通过模式对象和待匹配的字符串，生成比较器
		Matcher matcher = pattern.matcher(input);
		// 比较字符串，获得比较结果
		System.out.println(matcher.matches());
	}
}
