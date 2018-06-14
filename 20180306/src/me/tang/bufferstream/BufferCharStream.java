package me.tang.bufferstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 字符流:拷贝文件
 * 
 * @author Administrator
 *
 */
public class BufferCharStream {

	public static void copyFileByByteStream(String src, String dest) throws IOException {
		// 创建输入流
		Reader reader = new FileReader(src);
		// 创建文件字符缓冲输入流
		BufferedReader br = new BufferedReader(reader);
		// 创建输出流
		Writer writer = new FileWriter(dest);
		// 创建文件字符缓冲输出流
		BufferedWriter bw = new BufferedWriter(writer);
		// 读文件
		// 创建缓冲区
		char[] b = new char[512];
		int length;
		while ((length = br.read(b)) != -1) {
			// 写文件
			bw.write(b, 0, length);
		}
		// 刷新输出流
		bw.flush();
		//关闭输出流
		bw.close();
		//关闭输入流
		br.close();
	}

	public static void main(String[] args) throws Exception {
		String src = "D:\\tsk\\testFile\\test2-1.txt";
		String dest = "test2-1_1.txt";
		copyFileByByteStream(src, dest);
	}

}
