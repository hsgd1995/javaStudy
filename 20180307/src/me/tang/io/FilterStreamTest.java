package me.tang.io;

import java.awt.image.DataBuffer;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������
 * @author Administrator
 *
 */
public class FilterStreamTest {
	public static void main(String[] args) throws IOException {
		// ��������������װ���ļ��ڵ������ṩ����Ļ������
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("FilterStreamTest.txt"));
		// ��������������װ������һ�����������ṩ�����ֽ�д����
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeUTF("hello world");
		dos.writeChar('��');
		dos.flush();
		dos.close();
	}
}
