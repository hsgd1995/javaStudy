package me.tang.homework.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 * socket�ļ�����ͻ��ˣ��ϴ��ļ�
 * @author Administrator
 *
 */
public class TransferFileClient {
	public static void main(String[] args) throws Exception {
		//���ӷ����
		Socket socket = new Socket("127.0.0.1", 7878);
		//��ȡԴ�ļ��ļ�
		BufferedReader br = new BufferedReader(new FileReader("src/me/tang/homework/file/test.txt"));
		//�ϴ��ļ�����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		Thread t = new Thread() {
			@Override
			public void run() {
				int message;
				try {
					//��ȡԴ�ļ�
					while ((message = br.read()) != -1) {
						//�򻺳���д�ļ�
						bw.write(message);
						System.out.print((char)message);
					}
					bw.flush();
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		t.start();
	}

}
