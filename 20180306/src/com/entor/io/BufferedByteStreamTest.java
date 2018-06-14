package com.entor.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ��������������
 * @author Administrator
 *
 */
public class BufferedByteStreamTest {
	public static void copyFileByByteStream(String src, String dest) throws Exception {
		// 1.����������
		InputStream is = new FileInputStream(src);
		// �����ֽڻ���������
		BufferedInputStream bis = new BufferedInputStream(is);
		// 2.���������
		OutputStream os = new FileOutputStream(dest);
		// �����ֽڻ��������
		BufferedOutputStream bos = new BufferedOutputStream(os);
		// 3.���ļ�
		byte[] buffer = new byte[1024];// ������
		int length;// ��¼ÿ�ζ�ȡ�ĳ���
		while ((length = bis.read(buffer)) != -1) {
			// 4.д�ļ�
			bos.write(buffer, 0, length);
		}
		bos.flush();// ˢ�������
		bos.close();
		bis.close();
	}

	public static void main(String[] args) throws Exception {
		copyFileByByteStream("D:\\360��ȫ���������\\message.sql", "message.sql");
	}
}
