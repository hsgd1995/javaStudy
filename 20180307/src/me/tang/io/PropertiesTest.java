package me.tang.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Properties��ʵ���ļ���������
 * 
 * @author Administrator
 *
 */
public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		//��ȡ�ļ���������
		InputStream is = new FileInputStream("jdbc.properties");
		//����Properties����
		Properties p = new Properties();
		p.load(is);
		System.out.println(p.getProperty("jdbc.driverClass"));
		//��������
		p.setProperty("jdbc.url", "jdbc:mysql://localhost:3306/test");
		p.setProperty("jdbc.username", "root");
		p.setProperty("jdbc.password", "root");
		//������д���ļ���
		p.store(new FileOutputStream("src/me/tang/io/jdbc2.properties"), "���ݿ���������");
		
		//p = System.getProperties();
		p.list(System.out);
	}

}
