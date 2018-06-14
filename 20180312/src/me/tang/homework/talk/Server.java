package me.tang.homework.talk;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 服务端：DatagramSocket实现点对点通信
 * 
 * @author Administrator
 *
 */
public class Server {

	public static void main(String[] args) throws Exception {
		// 创建监听
		DatagramSocket server = new DatagramSocket(10001);
		// 接收信息的线程
		Thread t1 = new Thread() {
			@Override
			public void run() {
				// 准备数据报
				byte[] buffer = new byte[200];
				while (true) {
					try {
						DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
						// 接收信息
						server.receive(packet);
						System.out.println("收到" + packet.getAddress() + "的来信，内容是：" + new String(packet.getData()));

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		};
		// 发送信息的线程
		Thread t2 = new Thread() {
			@Override
			public void run() {
				Scanner s = new Scanner(System.in);
				String message;
				byte[] b;
				DatagramPacket packet2;
				while (true) {
					try {
						// 信息录入
						message = s.nextLine();
						b = message.getBytes();
						packet2 = new DatagramPacket(b, 0, b.length, InetAddress.getLocalHost(), 10002);
						// 发送信息
						server.send(packet2);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		};
		// 启动线程
		t1.start();
		t2.start();
	}

}
