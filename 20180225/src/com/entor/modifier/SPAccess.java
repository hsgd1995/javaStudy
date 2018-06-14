package com.entor.modifier;

public class SPAccess {
	public static void main(String[] args) {
		Target target = new Target();
		System.out.println(target.m_private);// 不被同包中的类访问
		System.out.println(target.m_default);
		System.out.println(target.m_protected);
		System.out.println(target.m_public);
	}
}
