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
public class BufferedCharStreamTest2 {
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
		String line;
		while ((line = br.readLine()) != null) {
			// 4.д�ļ�
			bw.write(line);
			bw.newLine();// �س�����
		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static void main(String[] args) throws Exception {
		copyFileByCharStream("D:\\JSD201801\\BUG֮ĸ��������������λŮ�ٽ�����.txt", "D:\\JSD201801\\Ů�ٽ�����.txt");
	}
}
