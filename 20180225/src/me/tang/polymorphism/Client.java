package me.tang.polymorphism;

/**
 * 客户端
 * 
 * @author Administrator
 *
 */
public class Client {

	/**
	 * 点击时间
	 * 
	 * @param e
	 */
	public void click(Environment e) {
		
		e.dealWithClickF1();
	}

	public static void main(String[] args) {
		Client c = new Client();
		c.click(new Chrome("chrome浏览器"));//此处相当于  Environment e = new Chrome("chrome浏览器");
		c.click(new EditPlus("EditPlus编辑器"));//此处相当于  Environment e = new EditPlus("EditPlus编辑器");
		c.click(new Eclipse("Eclipse浏览器"));//此处相当于  Environment e = new Eclipse("Eclipse浏览器");
	}

}
