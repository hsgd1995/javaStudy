package me.tang.inheritance;

/**
 * ���ࣺ��
 * 
 * @author Administrator
 *
 */
public class Person {
	private String name;// ����
	private int age;// ����

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
		System.out.println(name + "�ԣ�����");
	}
}
