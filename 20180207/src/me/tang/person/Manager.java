package me.tang.person;

/**
 * ���ࣺ���� �̳�Ա����
 * @author Administrator
 *
 */
public class Manager extends Employee {
	private String mno;// ������
	/**
	 * ������
	 */
	public void manager() {
		System.out.println(getName()+"�ڹ���");
	}

	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	@Override
	public String toString() {
		return "Manager [mno=" + mno + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

	

}
