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
 * socket文件传输服务端，上传文件
 * @author Administrator
 *
 */
public class TransferFileServer {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(7878);
		Socket socket = ss.accept();
		System.out.println("有新的客户端连接服务器，开始通信...");
		//文件从客户端输入
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//创建新文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/me/tang/homework/file/copyText.txt"));
		Thread t = new Thread(){
			@Override
			public void run() {
				int message;
				try {
					//读从客户端发来的文件
					while((message = br.read())!=-1){
						//向新文件中写数据
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
