package com.entor.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		// ��ȡjdbc.properties�ļ�����������
		InputStream is = new FileInputStream("jdbc.properties");
		// ����һ�����Զ���
		Properties p = new Properties();
		p.load(is);
		// ��ȡ����
		System.out.println(p.getProperty("jdbc.driverClass"));
		// ����������
		p.setProperty("jdbc.url", "jdbc:mysql://localhost:3306/test");
		p.setProperty("jdbc.username", "root");
		p.setProperty("jdbc.password", "root");
		// �������б�д���ļ���
		// p.list(System.out);
		p.store(new FileOutputStream("jdbc2.properties"), "jdbc�����������б�");

		// ϵͳ����
		p = System.getProperties();
		p.list(System.out);
	}
}
