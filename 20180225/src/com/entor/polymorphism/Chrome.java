package com.entor.polymorphism;

/**
 * Chrome�����
 * 
 * @author Administrator
 *
 */
public class Chrome extends Environment {
	public Chrome() {
	}

	public Chrome(String name) {
		super(name);
	}

	/**
	 * ���F1������
	 */
	public void afterClickF1() {
		System.out.println(getName() + "�У����F1��������ҳhttps://support.google.com/chrome/?p=help&ctx=keyboard");
	}
}
