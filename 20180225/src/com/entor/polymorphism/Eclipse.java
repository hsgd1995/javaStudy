package com.entor.polymorphism;

/**
 * Eclipse����
 * 
 * @author Administrator
 *
 */
public class Eclipse extends Environment {
	public Eclipse() {
	}

	public Eclipse(String name) {
		super(name);
	}

	/**
	 * ���F1������
	 */
	public void afterClickF1() {
		System.out.println(getName() + "�У����F1����Help��������");
	}
}
