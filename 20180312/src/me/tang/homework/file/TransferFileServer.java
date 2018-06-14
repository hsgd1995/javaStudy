package me.tang.homework.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
/**
 * socket�ļ��������ˣ��ϴ��ļ�
 * @author Administrator
 *
 */
public class TransferFileServer {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(7878);
		Socket socket = ss.accept();
		System.out.println("���µĿͻ������ӷ���������ʼͨ��...");
		//�ļ��ӿͻ�������
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//�������ļ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/me/tang/homework/file/copyText.txt"));
		Thread t = new Thread(){
			@Override
			public void run() {
				int message;
				try {
					//���ӿͻ��˷������ļ�
					while((message = br.read())!=-1){
						//�����ļ���д����
						bw.write((char)message);
						System.out.print((char)message);
						bw.flush();
					}
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		t.start();
	}

}
