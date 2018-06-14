package me.tang.bufferstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * �ַ���:�����ļ�
 * 
 * @author Administrator
 *
 */
public class BufferCharStream {

	public static void copyFileByByteStream(String src, String dest) throws IOException {
		// ����������
		Reader reader = new FileReader(src);
		// �����ļ��ַ�����������
		BufferedReader br = new BufferedReader(reader);
		// ���������
		Writer writer = new FileWriter(dest);
		// �����ļ��ַ����������
		BufferedWriter bw = new BufferedWriter(writer);
		// ���ļ�
		// ����������
		char[] b = new char[512];
		int length;
		while ((length = br.read(b)) != -1) {
			// д�ļ�
			bw.write(b, 0, length);
		}
		// ˢ�������
		bw.flush();
		//�ر������
		bw.close();
		//�ر�������
		br.close();
	}

	public static void main(String[] args) throws Exception {
		String src = "D:\\tsk\\testFile\\test2-1.txt";
		String dest = "test2-1_1.txt";
		copyFileByByteStream(src, dest);
	}

}
