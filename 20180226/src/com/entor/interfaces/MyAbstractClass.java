package com.entor.interfaces;

public abstract class MyAbstractClass implements MyInterface {

	public static void main(String[] args) {
		MyClass class1 = new MyClass();
		System.out.println(class1.NAME);
	}
}

class MyClass extends MyAbstractClass {

	@Override
	public void getName() {

	}

	@Override
	public void setName() {

	}
}