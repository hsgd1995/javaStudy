package me.tang.person;

/**
 * 子类：销售员 继承员工类
 * @author Administrator
 *
 */
public class Salesperson extends Employee{
	private String sno;//销售员工号

	/**
	 * 销售方法
	 */
	public void sale(){
		System.out.println(getName()+"在销售");
	}
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}
	@Override
	public String toString() {
		return "Salesperson [sno=" + sno + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
}
