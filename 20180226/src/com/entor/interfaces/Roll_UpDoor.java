package com.entor.interfaces;

public class Roll_UpDoor extends Door implements Alarm {
	public Roll_UpDoor() {
	}

	public Roll_UpDoor(String type) {
		super(type);
	}

	@Override
	public void divide() {
		System.out.println(getType() + "�������ں�����Ŀռ䣡");
	}

	@Override
	public void alarm() {
		System.out.println(getType() + "��������");
	}

}
