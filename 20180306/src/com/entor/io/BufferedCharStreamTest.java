package com.entor.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 字符流
 * 
 * @author Administrator
 *
 */
public class BufferedCharStreamTest {
	/**
	 * 通过字符方式复制文件
	 * 
	 * @param src
	 * @param dest
	 * @throws Exception
	 */
	public static void copyFileByCharStream(String src, String dest) throws Exception {
		// 1.创建文件字符输入流
		Reader reader = new FileReader(src);
		// 创建文件字符缓冲输入流
		BufferedReader br = new BufferedReader(reader);
		// 2.创建文件字符输出流
		Writer writer = new FileWriter(dest);
		// 创建文件字符缓冲输出流
		BufferedWriter bw = new BufferedWriter(writer);
		// 3.读文件
		char[] buffer = new char[512];
		int length;
		while ((length = br.read(buffer)) != -1) {
			// 4.写文件
			bw.write(buffer, 0, length);
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void main(String[] args) throws Exception {
		copyFileByCharStream("D:\\JSD201801\\BUG之母——美国海军首位女少将传奇.txt", "D:\\JSD201801\\BUG之母——女少将传奇.txt");
	}
}
