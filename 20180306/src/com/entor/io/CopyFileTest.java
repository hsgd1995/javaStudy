package com.entor.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileTest {
	public static void copyFileByByteStream(String src, String dest) throws Exception {
		// 1.����������
		InputStream is = new FileInputStream(src);
		// 2.���������
		OutputStream os = new FileOutputStream(dest);
		// 3.���ļ�
		byte[] buffer = new byte[1024];// ������
		int length;// ��¼ÿ�ζ�ȡ�ĳ���
		while ((length = is.read(buffer)) != -1) {
			// 4.д�ļ�
			os.write(buffer, 0, length);
		}
		os.flush();// ˢ�������
		os.close();
		is.close();
	}

	public static void main(String[] args) throws Exception {
		copyFileByByteStream("D:\\360��ȫ���������\\message.sql", "message.sql");
	}
}
