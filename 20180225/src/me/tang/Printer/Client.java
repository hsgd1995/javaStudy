package me.tang.Printer;

/**
 * 客户端
 * 
 * @author Administrator
 *
 */
public class Client {
	/**
	 * 处理打印
	 * 
	 * @param t
	 */
	public void print(Type t) {
		t.print();
	}

	public static void main(String[] args) {
		Client c = new Client();
		c.print(new Chromatic("彩色打印机"));
		c.print(new Monochrome("黑白打印机"));
	}

}
