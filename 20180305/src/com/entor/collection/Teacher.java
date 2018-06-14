package com.entor.collection;

public class Teacher {
	private Integer eno;
	private String name;

	public Teacher() {
	}

	public Teacher(Integer eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
