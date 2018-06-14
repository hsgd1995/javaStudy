package com.entor.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流
 * 
 * @author Administrator
 *
 */
public class ByteStreamTest {
	public static void main(String[] args) throws IOException {
		// 字节流超类：InputStream，OutputStream
		// 文件流操作，子类：FileInputStream（读文件），FileOutStream（写文件）
		// 例子：将src/com/entor/file/FileTest.java文件的内容读到程序中，并输出
		File file = new File("src/com/entor/file/FileTest.java");// 创建项目文件的对象
		FileInputStream fis = new FileInputStream(file);// 将文件对象与文件字节输入流关联起来
		// 读文件
		int buff;
		while ((buff = fis.read()) != -1) {
			System.out.print((char) buff);
		}
		fis.close();// 关闭流
		
		File file2 = new File("src/com/entor/file/out.txt");// 创建项目文件的对象
		FileOutputStream fos = new FileOutputStream(file2);// 将文件对象与文件字节输出流关联起来
		// 写文件
		for(int i = 1; i <=100;i++){
			fos.write(i);
		}
		fos.flush();// 刷新输出流
		fos.close();// 关闭流
	}
}
