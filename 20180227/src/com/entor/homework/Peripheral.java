package com.entor.homework;

/**
 * ����
 * 
 * @author Administrator
 *
 */
public abstract class Peripheral {
	private String name;

	public Peripheral() {
	}

	public Peripheral(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void conncet();
}
