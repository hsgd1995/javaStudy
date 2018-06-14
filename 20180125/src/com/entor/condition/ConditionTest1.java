package com.entor.condition;

public class ConditionTest1 {

	public static void main(String[] args) {
		// 假设当前用户正确的登录名和密码分别是888888 66666666
		// 模拟登录过程
		// 定义正确的登录名和密码
		int corr_loginname = 888888, corr_password = 66666666;
		// 定义输入的登录名和密码
		int input_loginname = 7777777, input_password = 44444444;
		// 验证用户名和密码
		if (corr_loginname == input_loginname && corr_password == input_password) {
			System.out.println("登录成功！");
		} else {
			System.out.println("用户名或密码错误！");
		}
		if(corr_loginname>1){
			System.out.println("1");
		}
	}
}

