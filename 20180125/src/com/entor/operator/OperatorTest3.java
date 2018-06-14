package com.entor.operator;

public class OperatorTest3 {

	public static void main(String[] args) {
		// 定义两个变量
		int a = 1, b = 2;

		// a+=b => a = a + b
		System.out.println("a+=b=>" + (a += b));// a=3,b=2
		System.out.println("b+=a=>" + (b += a));// a=3,b=5
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		// a-=b
		System.out.println("a-=b=>" + (a -= b));// a=-2,b=5
		System.out.println("b-=a=>" + (b -= a));// a=-2,b=7
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		// a*=b
		System.out.println("a*=b=>" + (a *= b));// a=-14,b=7
		System.out.println("b*=a=>" + (b *= a));// a=-14,b=-14*7
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		int c = 5, d = 3;
		// c/=d
		System.out.println("c/=d=>" + (c /= d));// c=1,d=3
		System.out.println("d/=c=>" + (d /= c));// c=1,d=3
		System.out.println("c=" + c);
		System.out.println("d=" + d);

		// c%=d
		System.out.println("c%=d=>" + (c %= d));// c=1,d=3
		System.out.println("d%=c=>" + (d %= c));// c=1,d=0
		System.out.println("c=" + c);
		System.out.println("d=" + d);

	}

}
