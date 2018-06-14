package me.tang.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Scanner;

/**
 * 提示用户输入账号，如果当前该账号不存在则创建， 
 * 提示输入金额，然后 把账号和金额保存到文件中，如账号存在则把金额显示出来。
 * 
 * @author Administrator
 *
 */
public class SaveUser {

	public static void main(String[] args) throws IOException {
		// 输入用户名
		System.out.println("请输入账户：");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.next();
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String username = br.readLine();
		
		// 加载user.properties文件
		InputStream is = new FileInputStream("user.properties");
		Properties p = new Properties();
		p.load(is);
		// 将输入的用户名与文件中的用户名比较
		if (p.getProperty(username) != null) {
			// 返回金额
			System.out.println("你的账户金额为：" + p.getProperty(username));
		} else {
			System.out.println("请输入金额：");
			double money = scanner.nextDouble();
			// 添加新的用户名和金额
			p.setProperty(username, money + "");
			// 写入文件
			p.store(new FileOutputStream("user.properties"), username);
			System.out.println("添加成功！");
		}

	}

}
