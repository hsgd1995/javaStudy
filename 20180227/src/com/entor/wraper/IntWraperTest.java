package com.entor.wraper;

public class IntWraperTest {
	public static void main(String[] args) {
		IntWraper num123 = new IntWraper(123);
		System.out.println(num123.getValue());
		num123 = new IntWraper("123");
		System.out.println(num123.getValue());
	}
}
