package me.tang.thread;

/**
 * �̲߳�����
 * 
 * @author Administrator
 *
 */
public class MyThreadTest {

	public static void main(String[] args) {
		// �����߳�
		MyThread myThread1 = new MyThread("�߳�1");
		MyThread myThread2 = new MyThread("�߳�2");
		// �����߳�
		myThread1.start();
		myThread2.start();
	}

}
