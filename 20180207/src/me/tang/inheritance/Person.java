package me.tang.inheritance;

/**
 * 父类：人
 * 
 * @author Administrator
 *
 */
public class Person {
	private String name;// 姓名
	private int age;// 年龄

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println(name + "吃！！！");
	}
}
