package me.tang.Printer;

/**
 * �ͻ���
 * 
 * @author Administrator
 *
 */
public class Client {
	/**
	 * �����ӡ
	 * 
	 * @param t
	 */
	public void print(Type t) {
		t.print();
	}

	public static void main(String[] args) {
		Client c = new Client();
		c.print(new Chromatic("��ɫ��ӡ��"));
		c.print(new Monochrome("�ڰ״�ӡ��"));
	}

}
