package me.tang.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1", 7878);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write("�������ã�\r\n");
		bw.flush();
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("�����-->"+br.readLine());
		System.out.print("�����룺");
		Scanner s = new Scanner(System.in);
		String message = s.nextLine();
		bw.write(message+"\r\n");
		bw.flush();
		System.out.print("�ͻ���:"+message);
		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("�����-->"+reader.readLine());
	}

}
