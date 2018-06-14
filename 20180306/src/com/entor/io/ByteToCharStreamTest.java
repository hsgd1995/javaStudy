package com.entor.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 字节流转字符流
 * 
 * @author Administrator
 *
 */
public class ByteToCharStreamTest {
	public static void main(String[] args) throws Exception {
		String src = "D:\\360安全浏览器下载\\message.sql", dest = "D:\\JSD201801\\message.sql";
		// 通过InputStreamReader创建一个来自于字节流的字符输入流
		InputStreamReader isr = new InputStreamReader(new FileInputStream(src));
		BufferedReader br = new BufferedReader(isr);
		// 通过OutputStreamWriter创建一个来自于字节流的字符输出流
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(dest));
		BufferedWriter bw = new BufferedWriter(osw);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.print(line + "\r\n");
			/*
			 * bw.write(line); bw.newLine();
			 */
		}
		bw.flush();
		bw.close();
		br.close();

	}
}
