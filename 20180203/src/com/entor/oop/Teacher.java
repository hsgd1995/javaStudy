package com.entor.oop;

/**
 * ��ʦ��
 * 
 * @author Administrator
 *
 */
public class Teacher {
	private int tno;// ����
	private String name;// ����
	private int age;// ����
	private int height;// ���
	private double weight;// ����

	// ��������
	public void eat() {
		System.out.println(name + "��");
	}

	// ��������
	public void drink() {
		System.out.println(name + "��");
	}

	// �������Ͽ�
	public void teach() {
		System.out.println(name + "�Ͽ�");
	}

	// ����Ҫ�����Ա���˽�л�
	// �ṩ������setter���������Խ��и�ֵ
	// �ṩ������getter������ȡ���Ե�ֵ

	// alt+shift+s��ݼ�
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
