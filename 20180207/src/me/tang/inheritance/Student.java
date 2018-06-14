package me.tang.inheritance;


/**
 * 子类：学生，继承Person
 * 
 * @author Administrator
 *
 */
public class Student extends Person {
	private int sno;// 学号

	public Student() {
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void study() {
		System.out.println(getName() + "学习！！！");
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

}
