package com.entor.collection;

public class Student implements Comparable<Student> {
	private Integer sno;
	private String name;

	public Student() {
	}

	public Student(Integer sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Student实例根据学号升序排列
	 */
	@Override
	public int compareTo(Student o) {
		return o.getSno() - sno;
	}

}
