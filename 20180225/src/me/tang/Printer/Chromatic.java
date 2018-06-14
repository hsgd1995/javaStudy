package me.tang.Printer;

/**
 * 彩色打印机
 * 
 * @author Administrator
 *
 */
public class Chromatic extends Type {

	public Chromatic(String printerName) {
		super(printerName);
	}

	/**
	 * 打印
	 */
	@Override
	public void print() {
		System.out.println("使用" + getPrinterName() + "中，打印出来的是彩色纸张！");
	}
}
