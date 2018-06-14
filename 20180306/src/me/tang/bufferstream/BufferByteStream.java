package me.tang.bufferstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * bufferSream:拷贝文件
 * @author Administrator
 *
 */
public class BufferByteStream {

	public static void copyFileByByteStream(String src,String dest) throws IOException{
		//创建输入流
		InputStream is = new FileInputStream(src);
		//创建字节缓冲输入流
		BufferedInputStream bis = new BufferedInputStream(is);
		//创建输出流
		OutputStream os = new FileOutputStream(dest);
		//创建字节缓冲输出流
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		//读文件
		//创建缓冲区
		byte[] b = new byte[1024];
		int length;
		while((length = bis.read(b))!=-1){
			bos.write(b, 0, length);
		}
		//刷新输出流
		bos.flush();
		bos.close();
		bis.close();
	}
	
	
	
	public static void main(String[] args) throws Exception {
		String src = "D:\\tsk\\testFile\\test2-1.txt";
		String dest = "D:\\tsk\\testFile\\test2-1_1.txt";
		copyFileByByteStream(src,dest);
	}

}
