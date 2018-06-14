package me.tang.homework.talk;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 客户端：DatagramSocket实现点对点通信
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		// 创建请求
		DatagramSocket client = new DatagramSocket(10002);
		// 发送信息的线程
		Thread t1 = new Thread() {
			@Override
			public void run() {
				Scanner s = new Scanner(System.in);
				while (true) {
					try {
						// 信息录入
						String message = s.nextLine();
						DatagramPacket packet = new DatagramPacket(message.getBytes(), 0, message.getBytes().length,
								InetAddress.getLocalHost(), 10001);
						// 发送消息
						client.send(packet);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		};
		// 接收信息的线程
		Thread t2 = new Thread() {
			@Override
			public void run() {
				byte[] bytes = new byte[40];
				while (true) {
					try {
						DatagramPacket p2 = new DatagramPacket(bytes, bytes.length);
						// 信息接收
						client.receive(p2);
						System.out.println("收到服务端来信：" + new String(p2.getData()));
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
