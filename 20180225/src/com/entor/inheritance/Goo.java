package com.entor.inheritance;

import java.util.ArrayList;

public class Goo {
	private int a;

	public Goo(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		Moo moo = new Moo();
		moo.add(123);
		System.out.println(moo);
	}
}

final class Moo extends ArrayList {
	public Moo() {
	}
}
