package com.entor.modifier2;

import com.entor.modifier.Target;

public class TargetSon extends Target {
	public static void main(String[] args) {
		TargetSon target = new TargetSon();
		System.out.println(target.m_private);// ������ͬ���е�������ʣ�˽�����Բ����̳�
		System.out.println(target.m_default);// ������ͬ���е�������ʣ���ͬ����Ĭ�����Բ����̳�
		System.out.println(target.m_protected);
		System.out.println(target.m_public);
	}
}
