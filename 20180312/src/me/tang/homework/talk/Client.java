package me.tang.homework.talk;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * �ͻ��ˣ�DatagramSocketʵ�ֵ�Ե�ͨ��
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		// ��������
		DatagramSocket client = new DatagramSocket(10002);
		// ������Ϣ���߳�
		Thread t1 = new Thread() {
			@Override
			public void run() {
				Scanner s = new Scanner(System.in);
				while (true) {
					try {
						// ��Ϣ¼��
						String message = s.nextLine();
						DatagramPacket packet = new DatagramPacket(message.getBytes(), 0, message.getBytes().length,
								InetAddress.getLocalHost(), 10001);
						// ������Ϣ
						client.send(packet);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		};
		// ������Ϣ���߳�
		Thread t2 = new Thread() {
			@Override
			public void run() {
				byte[] bytes = new byte[40];
				while (true) {
					try {
						DatagramPacket p2 = new DatagramPacket(bytes, bytes.length);
						// ��Ϣ����
						client.receive(p2);
						System.out.println("�յ���������ţ�" + new String(p2.getData()));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		};
		// �����߳�
		t1.start();
		t2.start();
	}

}
