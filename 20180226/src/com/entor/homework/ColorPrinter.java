package com.entor.homework;

/**
 * 彩色打印机
 * 
 * @author Administrator
 *
 */
public class ColorPrinter extends Printer {
	public ColorPrinter() {
	}

	public ColorPrinter(String type) {
		super(type);
	}

	@Override
	public void print() {
		System.out.println(getType() + "打印出彩色纸张！");
	}
}
