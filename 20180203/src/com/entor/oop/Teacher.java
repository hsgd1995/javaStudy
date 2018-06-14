package com.entor.oop;

/**
 * 老师类
 * 
 * @author Administrator
 *
 */
public class Teacher {
	private int tno;// 工号
	private String name;// 姓名
	private int age;// 年龄
	private int height;// 身高
	private double weight;// 体重

	// 方法：吃
	public void eat() {
		System.out.println(name + "吃");
	}

	// 方法：喝
	public void drink() {
		System.out.println(name + "喝");
	}

	// 方法：上课
	public void teach() {
		System.out.println(name + "上课");
	}

	// 按照要求，属性必须私有化
	// 提供公共的setter方法对属性进行赋值
	// 提供公共的getter方法获取属性的值

	// alt+shift+s快捷键
	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Teacher [tno=" + tno + ", name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight
				+ "]";
	}

}
