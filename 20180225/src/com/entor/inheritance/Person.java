package com.entor.inheritance;

/**
 * ����
 * 
 * @author Administrator
 *
 */
public class Person {
	private String name;

	public Person() {
	}

	public Person(String name) {
		super();// ���ø���Ĭ�ϵĹ�����
		System.out.println("Person�������Ĺ����������ã�");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void study() {
		System.out.println(name + "ѧϰ");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}
