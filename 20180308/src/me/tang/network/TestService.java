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
		System.out.println("�������������ȴ����ӡ�����");
		Socket socket = ss.accept();
		System.out.println("���µĿͻ������ӷ�������������ʼͨ�š���");
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("�ͻ���-->" + br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write("�ͻ�����ã�\r\n");
		bw.flush();
		System.out.println("�����룺");
		System.out.print("����ˣ�");
		Scanner s = new Scanner(System.in);
		String message = s.nextLine();
		bw.write(message+"\r\n");
		bw.flush();
	}

}
