package com.entor.interfaces;

public class MyInterfaceImpl implements MyInterface, MyInterface2 {

	@Override
	public void getName() {

	}

	@Override
	public void setName() {

	}

	@Override
	public void getAge() {

	}

	@Override
	public void setAge() {

	}

	@Override
	public void getHeight() {

	}

	@Override
	public void setHeight() {

	}

	@Override
	public void getAddress() {
		System.out.println("����׳����������������������³��·");
	}

	@Override
	public void setAddress() {
	}

	public static void main(String[] args) {
		MyInterface4 impl = new MyInterfaceImpl();
		impl.getAddress();
	}
}
