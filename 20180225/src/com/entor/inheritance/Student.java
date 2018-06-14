package com.entor.inheritance;

public class Student extends Person {
	private int sno;
	private String major;

	public Student() {
	}

	public Student(int sno, String major) {
		super();
		this.sno = sno;
		this.major = major;
	}

	public Student(int sno, String name, String major) {
		super(name);
		this.sno = sno;
		this.major = major;
		System.out.println("Student��3�����Ĺ����������ã�");
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public void study() {
		System.out.println(super.getName() + "ѧϰ" + major);
	}
}
