package com.entor.homework;

public class USBImpl implements USB {

	@Override
	public String connectByUSB() {
		return "通过" + USB + "连接PC!";
	}

}
