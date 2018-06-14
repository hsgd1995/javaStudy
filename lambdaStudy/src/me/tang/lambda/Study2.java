package me.tang.lambda;

/**
 * 线程
 * @author Administrator
 *
 */
public class Study2 {
	public static void main(String[] args) {
		new Thread(()->System.out.println("线程启动")).start();
	}
}
