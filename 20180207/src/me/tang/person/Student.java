package me.tang.person;

/**
 * 子类 ：学生
 * 
 * @author Administrator
 *
 */
public class Student extends Person {
	private int sno;// 学号

	public Student() {

	}

	/**
	 * 学习方法
	 */
	public void study() {
		System.out.println(getName() + "学习！！");
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	/**
	 * 重写toString方法
	 */
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getSex()=" + getSex()
				+ "]";
	}

}
