package com.entor.modifier2;

import com.entor.modifier.Target;

public class DPAccess {
	public static void main(String[] args) {
		Target target = new Target();
		System.out.println(target.m_private);// 不被不同包中的类访问
		System.out.println(target.m_default);// 不被不同包中的类访问
		System.out.println(target.m_protected);// 不被不同包中的类访问
		System.out.println(target.m_public);
	}
}
