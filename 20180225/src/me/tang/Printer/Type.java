package me.tang.Printer;

/**
 * 打印机种类
 * 
 * @author Administrator
 *
 */
public class Type {
	private String printerName;

	public Type() {
		super();
	}

	public Type(String printerName) {
		super();
		this.printerName = printerName;
	}

	/**
	 * 打印
	 */
	public void print() {

	}

	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

}
