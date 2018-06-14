package com.entor.inheritance;

public class Teacher extends Person {
	private int tno;

	public Teacher() {
	}

	public Teacher(int tno, String name) {
		super(name);
		this.tno = tno;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	@Override
	public String toString() {
		return "Teacher [tno=" + tno + ", getName()=" + getName() + "]";
	}
}
