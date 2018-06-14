package com.entor.homework;

public class Client {
	public static void connect(Peripheral p) {
		p.conncet();
	}

	public static void main(String[] args) {
		connect(new Mouse("ÄÁÂíÈËÊó±ê", new PS2Impl()));
	}
}
