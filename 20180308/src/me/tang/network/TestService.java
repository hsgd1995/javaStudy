package me.tang.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestService {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(7878);
		System.out.println("服务器启动，等待连接。。。");
		Socket socket = ss.accept();
		System.out.println("有新的客户端连接服务器。。。开始通信。。");
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("客户端-->" + br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write("客户端你好！\r\n");
		bw.flush();
		System.out.println("请输入：");
		System.out.print("服务端：");
		Scanner s = new Scanner(System.in);
		String message = s.nextLine();
		bw.write(message+"\r\n");
		bw.flush();
	}

}
