package me.tang.bufferstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 提示用户输入账号，如果当前该账号不存在则创建， 提示输入金额，然后 把账号和金额保存到文件中，如账号存在则把金额显示出来。
 * 
 * @author Administrator
 *
 */
public class Account {

	public static void main(String[] args) throws Exception {
		// 客户输入账号
		System.out.println("请输入账号：");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine().trim();
		// 创建文件字符输入流
		Reader reader = new FileReader("D:\\tsk\\testFile\\test2-1.txt");
		// 创建文件缓冲输入流
		BufferedReader br = new BufferedReader(reader);
		// 用于文件中所有用户信息
		List<String> list = new ArrayList<>();
		// 该用户名是否存在
		boolean flag = false;
		String str;
		while ((str = br.readLine()) != null) {
			list.add(str);
			// 切割每一行字符串，文件格式为：username money
			String account[] = str.split(" ");
			String name = account[0];// 获取账户
			if (name.equals(username)) {
				// 打印客户金额
				System.out.println("您的金额为：" + account[1]);
				flag = true;
			}
		}
		br.close();
		if (!flag) {
			// 如果客户输入的账户不在文件中，如果当前该账号不存在则创建，
			// 提示输入金额，然后 把账号和金额保存到文件中
			System.out.println("输入金额：");
			double money = scanner.nextDouble();
			// 创建文件字符输出流
			Writer writer = new FileWriter("D:\\tsk\\testFile\\test2-1.txt");
			// Writer writer = new FileWriter("D:\\tsk\\testFile\\test2-1.txt",true);
			// 创建文件缓冲输出流
			BufferedWriter bw = new BufferedWriter(writer);
			// 添加客户输入的信息
			list.add(username + " " + money);
			for (int i = 0; i < list.size(); i++) {
				// 写文件
				bw.write(list.get(i) + "\n");
			}
			bw.flush();
			bw.close();
		}
	}

}
