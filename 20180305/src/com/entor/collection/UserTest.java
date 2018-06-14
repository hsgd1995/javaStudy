package com.entor.collection;

public class UserTest {
	public static void main(String[] args) {
		UserInfo u1 = new UserInfo(1, "张三");
		UserInfo u2 = new UserInfo(1, "张三");
		System.out.println(u1 == u2);

		// 如果u1!=u2，那怎样才能是的u1与u2表示同一个员工
		// 可以重写equals，实现u1.equals(u2) == true
		System.out.println(u1.equals(u2));
	}
}
