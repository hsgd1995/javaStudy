package com.entor.homework;

/**
 * �ڰ״�ӡ��
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
		System.out.println(getType() + "��ӡ���ڰ�ֽ�ţ�");
	}
}
