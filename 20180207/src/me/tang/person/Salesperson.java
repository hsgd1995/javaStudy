package me.tang.person;

/**
 * ���ࣺ����Ա �̳�Ա����
 * @author Administrator
 *
 */
public class Salesperson extends Employee{
	private String sno;//����Ա����

	/**
	 * ���۷���
	 */
	public void sale(){
		System.out.println(getName()+"������");
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
