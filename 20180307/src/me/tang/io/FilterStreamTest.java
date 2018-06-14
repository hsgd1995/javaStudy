package me.tang.io;

import java.awt.image.DataBuffer;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 过滤流
 * @author Administrator
 *
 */
public class FilterStreamTest {
	public static void main(String[] args) throws IOException {
		// 创建过滤流，封装了文件节点流：提供额外的缓冲操作
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("FilterStreamTest.txt"));
		// 创建过滤流，封装了另外一个过滤流：提供额外字节写操作
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeUTF("hello world");
		dos.writeChar('天');
		dos.flush();
		dos.close();
	}
}
