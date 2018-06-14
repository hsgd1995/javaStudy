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
 * bufferSream:�����ļ�
 * @author Administrator
 *
 */
public class BufferByteStream {

	public static void copyFileByByteStream(String src,String dest) throws IOException{
		//����������
		InputStream is = new FileInputStream(src);
		//�����ֽڻ���������
		BufferedInputStream bis = new BufferedInputStream(is);
		//���������
		OutputStream os = new FileOutputStream(dest);
		//�����ֽڻ��������
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		//���ļ�
		//����������
		byte[] b = new byte[1024];
		int length;
		while((length = bis.read(b))!=-1){
			bos.write(b, 0, length);
		}
		//ˢ�������
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
