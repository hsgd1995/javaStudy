package me.tang.Printer;

/**
 * �ڰ״�ӡ��
 * 
 * @author Administrator
 *
 */
public class Monochrome extends Type {

	public Monochrome(String printerName) {
		super(printerName);
	}

	/**
	 * ��ӡ
	 */
	@Override
	public void print() {
		System.out.println("ʹ��" + getPrinterName() + "�У���ӡ�������Ǻڰ�ֽ��!");
	}
}
