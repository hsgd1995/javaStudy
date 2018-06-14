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
 * socket文件传输客户端，上传文件
 * @author Administrator
 *
 */
public class TransferFileClient {
	public static void main(String[] args) throws Exception {
		//连接服务端
		Socket socket = new Socket("127.0.0.1", 7878);
		//读取源文件文件
		BufferedReader br = new BufferedReader(new FileReader("src/me/tang/homework/file/test.txt"));
		//上传文件缓冲
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		Thread t = new Thread() {
			@Override
			public void run() {
				int message;
				try {
					//读取源文件
					while ((message = br.read()) != -1) {
						//向缓冲区写文件
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
