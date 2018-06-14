package com.entor.string;

public class StringTest {
	public static void main(String[] args) {
		// 创建一个可变字符序列对象
		// 底层创建一个长度为16的char数组
		// append方法一直返回builder对象，并未产生新的StringBuilder对象
		StringBuilder builder = new StringBuilder();
		System.out.println(builder.length());
		builder.append("123").append("456").append("789");

		String str = "123";
		str.concat("456").concat("789");// 额外产生了两个String对象
		
		builder.delete(3, 5);
		System.out.println(builder);
		
		System.out.println("1236789".equals(builder.toString()));
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("123").append("456").append("789");
		buffer.delete(3, 5);
		System.out.println(buffer);
		System.out.println(buffer.reverse());
		String date = "2018-02-02 12:44:33 111";
	}
}
