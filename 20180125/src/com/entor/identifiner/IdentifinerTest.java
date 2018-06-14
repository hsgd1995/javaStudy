package com.entor.identifiner;

/**
 * 标识符与变量
 * @author Administrator
 *
 */
public class IdentifinerTest {
	
	//main():java程序运行的入口
	public static void main(String[] args) {
		int x,y,z = 100;//定义x,y,z变量；对变量z赋值
		int a=100,b,c=100;//定义a,b,c变量；对变量a,c赋值
		int q=100,w=100,e=100;//定义a,b,c变量；对变量a,b,c赋值
		System.out.println("a="+a);
		System.out.println("z:"+z);
		System.out.println("c="+c);
		System.out.println("q:"+q+" w:"+w+" e:"+e);
		
		int j=20;
		int k=10;
		System.out.println("j:"+j+"k:"+k);
		j=j+k;
		System.out.println("j:"+j+"k:"+k);
		k=j-k;
		System.out.println("j:"+j+"k:"+k);
		j=j-k;
		System.out.println("j:"+j+"k:"+k);
		
		
	}
	
}