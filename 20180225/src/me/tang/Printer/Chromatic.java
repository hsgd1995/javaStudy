package me.tang.Printer;

/**
 * ��ɫ��ӡ��
 * 
 * @author Administrator
 *
 */
public class Chromatic extends Type {

	public Chromatic(String printerName) {
		super(printerName);
	}

	/**
	 * ��ӡ
	 */
	@Override
	public void print() {
		System.out.println("ʹ��" + getPrinterName() + "�У���ӡ�������ǲ�ɫֽ�ţ�");
	}
}
