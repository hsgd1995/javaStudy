package me.tang.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Properties，实现文件拷贝工作
 * 
 * @author Administrator
 *
 */
public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		//读取文件到输入流
		InputStream is = new FileInputStream("jdbc.properties");
		//创建Properties对象
		Properties p = new Properties();
		p.load(is);
		System.out.println(p.getProperty("jdbc.driverClass"));
		//设置属性
		p.setProperty("jdbc.url", "jdbc:mysql://localhost:3306/test");
		p.setProperty("jdbc.username", "root");
		p.setProperty("jdbc.password", "root");
		//将数据写到文件中
		p.store(new FileOutputStream("src/me/tang/io/jdbc2.properties"), "数据库连接属性");
		
		//p = System.getProperties();
		p.list(System.out);
	}

}
