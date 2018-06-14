package com.entor.wraper;

public class DoubleWraperTest {
	public static void main(String[] args) {
		DoubleWraper dw = new DoubleWraper(3.4);
		System.out.println(DoubleWraper.parseDouble('a'));
		System.out.println(DoubleWraper.parseDouble("123.123"));
	}
}
