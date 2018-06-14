package com.entor.condition;

/**
 * 条件语句：if...else...嵌套语句
 * 
 * @author Administrator
 *
 */
public class ConditionTest2 {

	public static void main(String[] args) {
		// 假设当前用户正确的登录名和密码分别是888888 66666666
		// 模拟登录过程：如果用户不存在，不需要验证密码，直接输出用户不存提示
		// 如果密码错误，提示密码错误

		// 定义正确的登录名和密码
		int corr_loginname = 888888, corr_password = 66666666;
		// 定义输入的登录名和密码
		int input_loginname = 7777777, input_password = 44444444;
		// 验证用户名和密码
		if (corr_loginname == input_loginname) {
			if (corr_password == input_password) {
				System.out.println("登录成功！");
			} else {
				System.out.println("密码错误！");
			}
		} else {
			System.out.println("用户名不存在！");
		}
	}

}
