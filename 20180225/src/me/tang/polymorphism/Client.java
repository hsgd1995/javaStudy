package me.tang.polymorphism;

/**
 * �ͻ���
 * 
 * @author Administrator
 *
 */
public class Client {

	/**
	 * ���ʱ��
	 * 
	 * @param e
	 */
	public void click(Environment e) {
		
		e.dealWithClickF1();
	}

	public static void main(String[] args) {
		Client c = new Client();
		c.click(new Chrome("chrome�����"));//�˴��൱��  Environment e = new Chrome("chrome�����");
		c.click(new EditPlus("EditPlus�༭��"));//�˴��൱��  Environment e = new EditPlus("EditPlus�༭��");
		c.click(new Eclipse("Eclipse�����"));//�˴��൱��  Environment e = new Eclipse("Eclipse�����");
	}

}
