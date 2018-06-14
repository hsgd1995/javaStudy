package me.tang.person;

/**
 * 子类 ：老师 继承Person
 * @author Administrator
 *
 */
public class Teacher extends Person {
	private int tno;//工号

	public Teacher() {

	}

	/**
	 * 上课方法
	 */
	public void teach() {
		System.out.println(getName()+"上课！！！");
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	/**
	 * 重写toString方法
	 */
	@Override
	public String toString() {
		return "Teacher [tno=" + tno + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getSex()=" + getSex()+ "]";
	}
	
	
	

}
