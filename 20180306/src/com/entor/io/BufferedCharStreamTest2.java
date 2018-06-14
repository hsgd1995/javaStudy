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
public class BufferedCharStreamTest2 {
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
		String line;
		while ((line = br.readLine()) != null) {
			// 4.写文件
			bw.write(line);
			bw.newLine();// 回车换行
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void main(String[] args) throws Exception {
		copyFileByCharStream("D:\\JSD201801\\BUG之母——美国海军首位女少将传奇.txt", "D:\\JSD201801\\女少将传奇.txt");
	}
}
