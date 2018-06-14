package me.tang.Printer;

/**
 * 黑白打印机
 * 
 * @author Administrator
 *
 */
public class Monochrome extends Type {

	public Monochrome(String printerName) {
		super(printerName);
	}

	/**
	 * 打印
	 */
	@Override
	public void print() {
		System.out.println("使用" + getPrinterName() + "中，打印出来的是黑白纸张!");
	}
}
