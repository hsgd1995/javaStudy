package me.tang.homework.talk;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * ����ˣ�DatagramSocketʵ�ֵ�Ե�ͨ��
 * 
 * @author Administrator
 *
 */
public class Server {

	public static void main(String[] args) throws Exception {
		// ��������
		DatagramSocket server = new DatagramSocket(10001);
		// ������Ϣ���߳�
		Thread t1 = new Thread() {
			@Override
			public void run() {
				// ׼�����ݱ�
				byte[] buffer = new byte[200];
				while (true) {
					try {
						DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
						// ������Ϣ
						server.receive(packet);
						System.out.println("�յ�" + packet.getAddress() + "�����ţ������ǣ�" + new String(packet.getData()));

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		};
		// ������Ϣ���߳�
		Thread t2 = new Thread() {
			@Override
			public void run() {
				Scanner s = new Scanner(System.in);
				String message;
				byte[] b;
				DatagramPacket packet2;
				while (true) {
					try {
						// ��Ϣ¼��
						message = s.nextLine();
						b = message.getBytes();
						packet2 = new DatagramPacket(b, 0, b.length, InetAddress.getLocalHost(), 10002);
						// ������Ϣ
						server.send(packet2);
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
