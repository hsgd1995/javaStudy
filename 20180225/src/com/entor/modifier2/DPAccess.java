package com.entor.modifier2;

import com.entor.modifier.Target;

public class DPAccess {
	public static void main(String[] args) {
		Target target = new Target();
		System.out.println(target.m_private);// ������ͬ���е������
		System.out.println(target.m_default);// ������ͬ���е������
		System.out.println(target.m_protected);// ������ͬ���е������
		System.out.println(target.m_public);
	}
}
