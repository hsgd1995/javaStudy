package com.entor.interfaces;

/**
 * ������
 * 
 * @author Administrator
 *
 */
public abstract class Door {
	private String type;// ����

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
	 * ����ռ�
	 */
	public abstract void divide();
}
