package com.entor.modifier;

public class TargetSon extends Target {
	public static void main(String[] args) {
		TargetSon target = new TargetSon();
		System.out.println(target.m_private);// 不被同包中的子类访问，私有属性不被继承
		System.out.println(target.m_default);
		System.out.println(target.m_protected);
		System.out.println(target.m_public);
	}
}
