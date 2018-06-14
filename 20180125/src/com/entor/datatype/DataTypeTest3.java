package com.entor.datatype;

/**
 * 字符串变量
 * 
 * @author Administrator
 *
 */
public class DataTypeTest3 {
	public static void main(String[] args) {

		// 一个可以用字面量赋值的引用类型；
		String string = "123";
		String string2 = "abc";
		String string3 = "#$%";
		String string4 = "";// 长度为0的字符串
		String string5 = null;// 没有指向任何一个有意义的值

		// 长度
		String str = "   A  B  C    ";
		System.out.println("半角空格:" + (int) ' ');
		System.out.println("str的长度：" + str.length());
		// 去首尾空格
		System.out.println("去掉首尾空格长度：" + str.trim().length());
		// 替换空格
		System.out.println("替换所有空格长度：" + str.replaceAll(" ", "").length());
		// 比较两个字符串相等equals
		System.out.println("ABC".equals(str));
		System.out.println(str.equals("ABC"));
	}
}
