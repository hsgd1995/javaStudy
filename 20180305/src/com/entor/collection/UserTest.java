package com.entor.collection;

public class UserTest {
	public static void main(String[] args) {
		UserInfo u1 = new UserInfo(1, "����");
		UserInfo u2 = new UserInfo(1, "����");
		System.out.println(u1 == u2);

		// ���u1!=u2�������������ǵ�u1��u2��ʾͬһ��Ա��
		// ������дequals��ʵ��u1.equals(u2) == true
		System.out.println(u1.equals(u2));
	}
}
