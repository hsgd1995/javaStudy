package com.entor.oop;

import java.util.Scanner;

/**
 * 管理员类测试类
 * 
 * @author Administrator
 *
 */
public class AdministratorTest2 {
	public static void main(String[] args) {
		// 创建admin对象，保存了正确的用户名和密码
		Administrator admin = new Administrator();
		admin.setName("admin");
		admin.setPassword("111111");

		// 输入用户名和密码
		Scanner sc = new Scanner(System.in);

		// 与admin对象进行匹配 get方法取出数据与输入的数据用equals方法匹配
		System.out.println("请输入用户名：");
		String username = sc.next();
		System.out.println("请输入密码：");
		String password = sc.next();

		if (admin.getName().equals(username) && admin.getPassword().equals(password)) {
			String newpass = null;// 声明新密码
			while (true) {
				// 匹配成功，获得权限，输入新密码
				System.out.println("请输入新密码：");
				newpass = sc.next();
				// 在输入新密码，两次输入不一致，重新输入，直到输入一致（考虑while循环）
				System.out.println("再次输入新密码：");
				String repass = sc.next();

				if (newpass.equals(repass)) {
					break;
				}
				System.out.println("两次输入的密码不一致，请重新输入！");
			}
			// 修改admin对象中的密码
			admin.setPassword(newpass);
			// 修改成功，输出admin对象
			System.out.println("修改成功，管理员的新密码：" + admin.getPassword());
		} else {
			// 匹配失败，没有权限，程序结束
			System.out.println("权限验证失败，退出系统！");
		}
	}
}
