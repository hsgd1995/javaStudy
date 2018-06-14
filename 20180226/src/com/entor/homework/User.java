package com.entor.homework;

/**
 * 多态应用练习
 * 
 * @author Administrator
 *
 */
public class User {
	public static void print(Printer printer) {
		printer.print();
	}

	public static void main(String[] args) {
		User.print(new BWPrinter("黑白打印机"));
		User.print(new ColorPrinter("彩色打印机"));
	}
}
