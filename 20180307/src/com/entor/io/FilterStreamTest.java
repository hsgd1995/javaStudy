package com.entor.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ��д�ļ��ֽ�������д�ļ��ַ������ڵ��� <br>
 * ���������൱���ڽڵ��������������Ļ����ϣ��ṩ����ķ�װ����Ϊ������<br>
 * ������֮���ǿ��Ի�����з�װ
 * 
 * @author Administrator
 *
 */
public class FilterStreamTest {
	public static void main(String[] args) throws IOException {
		// ��������������װ���ļ��ڵ������ṩ����Ļ������
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("abc.txt"));
		// ��������������װ������һ�����������ṩ�����ֽ�д����
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeInt(123);
		dos.writeLong(123123123123L);
		dos.writeChar('��');
		dos.flush();
		dos.close();

		// ��������������װ���ļ��ڵ������ṩ����Ļ������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("abc.txt"));
		// ��������������װ������һ�����������ṩ�����ֽ�д����
		DataInputStream dis = new DataInputStream(bis);
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readChar());
		dis.close();
	}
}
