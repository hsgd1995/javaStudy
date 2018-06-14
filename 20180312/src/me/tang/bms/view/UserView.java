package me.tang.bms.view;

import java.util.Scanner;

import me.tang.bms.entity.User;
import me.tang.bms.service.UserService;
import me.tang.bms.service.impl.UserServiceImpl;

public class UserView {
	private Scanner sc = new Scanner(System.in);
	private UserService userService = new UserServiceImpl();

	public UserView() {
		// 欢迎页面
		welcome();
	}

	/**
	 * 欢迎页
	 */
	private void welcome() {
		System.out.println("+++++欢迎使用图书馆里系统+++++");
		System.out.println("+++++1.用户注册                  +++++");
		System.out.println("+++++2.登录系统                  +++++");
		System.out.println("+++++3.退出系统                  +++++");

		while (true) {
			System.out.println("请输入选项：");
			String option = sc.next();
			if ("1".equals(option)) {// 跳转注册页
				register();
				return;
			}

			if ("2".equals(option)) {// 跳转登录页

				return;
			}

			if ("3".equals(option)) {// 退出系统
				System.exit(0);
			}

			System.out.println("请输入正确的选项！");
		}
	}

	/**
	 * 注册
	 */
	private void register() {
		System.out.println("+++++注册页面+++++");
		System.out.println("请输入姓名：");
		String name = sc.next();
		System.out.println("请输入证件号：");
		String idCard = sc.next();

		// 数据封装到对象
		User user = new User();
		user.setUid(1);
		user.setName(name);
		user.setIdCard(idCard);
		user.setStatus(0);

		user.getRentBooks().add(1);
		user.getRentBooks().add(2);
		user.getRentBooks().add(3);
		user.getRentBooks().add(4);

		// 保存数据对象
		userService.saveUser(user);
		System.out.println("注册成功！");
	}

}
