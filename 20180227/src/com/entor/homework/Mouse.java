package com.entor.homework;

public class Mouse extends Peripheral {
	private IO io;

	public Mouse() {
	}

	public Mouse(String name, IO io) {
		super(name);
		this.io = io;
	}

	@Override
	public void conncet() {
		if (io instanceof USB) {
			USB usb = (USB) io;
			System.out.println(getName() + usb.connectByUSB());
		} else {
			PS2 ps2 = (PS2) io;
			System.out.println(getName() + ps2.connectByPS2());
		}
	}
}
