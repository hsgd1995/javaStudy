package me.tang.person;

/**
 * ���� ��ѧ��
 * 
 * @author Administrator
 *
 */
public class Student extends Person {
	private int sno;// ѧ��

	public Student() {

	}

	/**
	 * ѧϰ����
	 */
	public void study() {
		System.out.println(getName() + "ѧϰ����");
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	/**
	 * ��дtoString����
	 */
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getSex()=" + getSex()
				+ "]";
	}

}
