package me.tang.inheritance;


/**
 * ���ࣺѧ�����̳�Person
 * 
 * @author Administrator
 *
 */
public class Student extends Person {
	private int sno;// ѧ��

	public Student() {
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void study() {
		System.out.println(getName() + "ѧϰ������");
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

}
