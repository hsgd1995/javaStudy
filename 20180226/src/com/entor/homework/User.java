package com.entor.homework;

/**
 * ��̬Ӧ����ϰ
 * 
 * @author Administrator
 *
 */
public class User {
	public static void print(Printer printer) {
		printer.print();
	}

	public static void main(String[] args) {
		User.print(new BWPrinter("�ڰ״�ӡ��"));
		User.print(new ColorPrinter("��ɫ��ӡ��"));
	}
}
