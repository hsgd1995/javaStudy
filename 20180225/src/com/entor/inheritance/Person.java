package com.entor.inheritance;

/**
 * 父类
 * 
 * @author Administrator
 *
 */
public class Person {
	private String name;

	public Person() {
	}

	public Person(String name) {
		super();// 调用父类默认的构造器
		System.out.println("Person带参数的构造器被调用！");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void study() {
		System.out.println(name + "学习");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}
