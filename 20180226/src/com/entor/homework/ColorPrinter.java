package com.entor.homework;

/**
 * ��ɫ��ӡ��
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
		System.out.println(getType() + "��ӡ����ɫֽ�ţ�");
	}
}
