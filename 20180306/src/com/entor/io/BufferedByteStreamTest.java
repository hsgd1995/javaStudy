package com.entor.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 过滤流：缓冲流
 * @author Administrator
 *
 */
public class BufferedByteStreamTest {
	public static void copyFileByByteStream(String src, String dest) throws Exception {
		// 1.创建输入流
		InputStream is = new FileInputStream(src);
		// 创建字节缓冲输入流
		BufferedInputStream bis = new BufferedInputStream(is);
		// 2.创建输出流
		OutputStream os = new FileOutputStream(dest);
		// 创建字节缓冲输出流
		BufferedOutputStream bos = new BufferedOutputStream(os);
		// 3.读文件
		byte[] buffer = new byte[1024];// 缓冲区
		int length;// 记录每次读取的长度
		while ((length = bis.read(buffer)) != -1) {
			// 4.写文件
			bos.write(buffer, 0, length);
		}
		bos.flush();// 刷新输出流
		bos.close();
		bis.close();
	}

	public static void main(String[] args) throws Exception {
		copyFileByByteStream("D:\\360安全浏览器下载\\message.sql", "message.sql");
	}
}
