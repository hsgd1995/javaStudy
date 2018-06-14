package com.entor.collection;

import java.util.HashSet;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		String s1 = new String("a");
		String s2 = new String("a");
		HashSet<String> set = new HashSet<>();
		set.add(s1);
		set.add(s2);
		System.out.println(set);
		Random random = new Random();
		int a = 0;
		for(int i=0;i<10;i++){
		a=random.nextInt(101);
		System.out.println(a);
		}
		int b = (int) Math.random();
	}

}
