package com.entor.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * �ַ���
 * 
 * @author Administrator
 *
 */
public class BufferedCharStreamTest {
	/**
	 * ͨ���ַ���ʽ�����ļ�
	 * 
	 * @param src
	 * @param dest
	 * @throws Exception
	 */
	public static void copyFileByCharStream(String src, String dest) throws Exception {
		// 1.�����ļ��ַ�������
		Reader reader = new FileReader(src);
		// �����ļ��ַ�����������
		BufferedReader br = new BufferedReader(reader);
		// 2.�����ļ��ַ������
		Writer writer = new FileWriter(dest);
		// �����ļ��ַ����������
		BufferedWriter bw = new BufferedWriter(writer);
		// 3.���ļ�
		char[] buffer = new char[512];
		int length;
		while ((length = br.read(buffer)) != -1) {
			// 4.д�ļ�
			bw.write(buffer, 0, length);
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void main(String[] args) throws Exception {
		copyFileByCharStream("D:\\JSD201801\\BUG֮ĸ��������������λŮ�ٽ�����.txt", "D:\\JSD201801\\BUG֮ĸ����Ů�ٽ�����.txt");
	}
}
