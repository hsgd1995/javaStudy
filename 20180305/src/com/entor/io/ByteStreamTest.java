package com.entor.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ֽ���
 * 
 * @author Administrator
 *
 */
public class ByteStreamTest {
	public static void main(String[] args) throws IOException {
		// �ֽ������ࣺInputStream��OutputStream
		// �ļ������������ࣺFileInputStream�����ļ�����FileOutStream��д�ļ���
		// ���ӣ���src/com/entor/file/FileTest.java�ļ������ݶ��������У������
		File file = new File("src/com/entor/file/FileTest.java");// ������Ŀ�ļ��Ķ���
		FileInputStream fis = new FileInputStream(file);// ���ļ��������ļ��ֽ���������������
		// ���ļ�
		int buff;
		while ((buff = fis.read()) != -1) {
			System.out.print((char) buff);
		}
		fis.close();// �ر���
		
		File file2 = new File("src/com/entor/file/out.txt");// ������Ŀ�ļ��Ķ���
		FileOutputStream fos = new FileOutputStream(file2);// ���ļ��������ļ��ֽ��������������
		// д�ļ�
		for(int i = 1; i <=100;i++){
			fos.write(i);
		}
		fos.flush();// ˢ�������
		fos.close();// �ر���
	}
}
