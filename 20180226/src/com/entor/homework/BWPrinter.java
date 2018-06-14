package com.entor.homework;

/**
 * 黑白打印机
 * 
 * @author Administrator
 *
 */
public class BWPrinter extends Printer {
	public BWPrinter() {
	}

	public BWPrinter(String type) {
		super(type);
	}

	@Override
	public void print() {
		System.out.println(getType() + "打印出黑白纸张！");
	}
}
