package com.entor.interfaces;

/**
 * 抽象类
 * 
 * @author Administrator
 *
 */
public abstract class Door {
	private String type;// 类型

	public Door() {
	}

	public Door(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 隔离空间
	 */
	public abstract void divide();
}
