package com.entor.character;

/**
 * 特殊字符
 * 
 * @author Administrator
 *
 */
public class CharTest {
	public static void main(String[] args) {

		// 转义字符
		char char1 = '\\';
		System.out.println(char1);

		// 定义双引号
		char char2 = '"';
		System.out.println(char2);

		// 定义单引号
		char char3 = '\'';
		System.out.println(char3);

		// 定义换行符
		char char4 = '\n';
		System.out.println(char4 + "换行了");

		// 定义制表符
		char char5 = '\t';
		System.out.println(char5 + "制表符");

		// 定义单引号
		String str1 = "'";
		System.out.println(str1);

		// 定义双引号
		String str2 = "\"";
		System.out.println(str2);

		// 定义换行符
		String str3 = "\n";
		System.out.println(str3 + "换行了");

		// 定义制表符
		String str4 = "\t";
		System.out.println(str4 + "制表符");

		// 定义转义符
		String str5 = "\\";
		System.out.println(str5);

	}
}
