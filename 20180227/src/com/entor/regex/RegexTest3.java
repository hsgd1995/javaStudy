package com.entor.regex;

public class RegexTest3 {
	public static void main(String[] args) {
		// 111,222,333,444
		String string = "111,,,222,333,444";
		String[] strs = string.split(",{3}");
		for (String string2 : strs) {
			System.out.println(string2);
		}
		
		// 将字符串中的所有数字剔除掉
		String str = "1a2b3c4dffg7653aaa";
		String regex = "\\d";
		String str2 = str.replaceAll(regex, "");
		System.out.println(str2);
	}
}
