package me.tang.person;

/**
 * ���� ����ʦ �̳�Person
 * @author Administrator
 *
 */
public class Teacher extends Person {
	private int tno;//����

	public Teacher() {

	}

	/**
	 * �Ͽη���
	 */
	public void teach() {
		System.out.println(getName()+"�ϿΣ�����");
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	/**
	 * ��дtoString����
	 */
	@Override
	public String toString() {
		return "Teacher [tno=" + tno + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getSex()=" + getSex()+ "]";
	}
	
	
	

}
