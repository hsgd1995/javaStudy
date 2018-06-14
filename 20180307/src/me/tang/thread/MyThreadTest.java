package me.tang.thread;

/**
 * 线程测试类
 * 
 * @author Administrator
 *
 */
public class MyThreadTest {

	public static void main(String[] args) {
		// 创建线程
		MyThread myThread1 = new MyThread("线程1");
		MyThread myThread2 = new MyThread("线程2");
		// 启动线程
		myThread1.start();
		myThread2.start();
	}

}
