package com.entor.oop;

/**
 * 管理员类
 * 
 * @author Administrator
 *
 */
public class Administrator {
	private String name;
	private int age;
	private String department;
	private String password;

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "管理员信息 [name=" + name + ", password=" + password + "]";
	}

}
