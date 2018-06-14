package me.tang.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Test {
	private String a;
	
	private void test(){
		
	}
	public static void main(String[] args) {
		//ArrayList myList=(ArrayList) new Object();
		//ArrayList myList=new ArrayList();
		//myList.add("A");
		//myList.add("B");
		//myList.size();
		
		LinkedList list=new LinkedList();  
		list.add("A");  
		list.add(2,"B");  
		String s=(String)list.get(1);  //null
		System.out.println(s); 
	}
	
	public static void a(){
		System.out.println("aaaaaaaa");
	}
	public static void b(){
		a();
		
	}
	
	public void c(){
		
	}
	public abstract void d();
}
