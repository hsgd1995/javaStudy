package me.tang.person;

/**
 * 子类：经理 继承员工类
 * @author Administrator
 *
 */
public class Manager extends Employee {
	private String mno;// 经理工号
	/**
	 * 管理方法
	 */
	public void manager() {
		System.out.println(getName()+"在管理！");
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
