package com.entor.datatype;

/**
 * 数据类型与变量
 * @author Administrator
 *
 */
public class DataTypeTest {

	public static void main(String[] args) {
		// 有符号数整数
				byte byte1 = 127;//范围大的字面量赋值范围小的变量，范围小的变量可以表示，字面量自动转换成范围小的类型
				byte byte2 = -128;
				// byte byte3 = 128; // 范围大的字面量赋值范围小的变量，但是范围小的变量无法表示，不可自动转换；
				short short1 = 32767;
				short short2 = -32768;
				// short short3 = 32768;// 范围大的字面量赋值范围小的变量，但是范围小的变量无法表示，不可自动转换；
				int int1 = -2000000000;
				int int2 = 2000000000;
				// int int3 = 3000000000;//范围大的字面量赋值范围小的变量，但是范围小的变量无法表示，不可自动转换；
				long long1 = -3000000000L;//范围小的字面量赋值范围大的变量，出现越界问题，解决方式，将字面量通过标记升格成范围大的类型；
				long long2 = 3000000000L;
				// 有符号小数
				float float1 = -1.234567890F;
				float float2 = 1.12121212121212f;
				System.out.println("float1=" + float1);
				System.out.println("float2=" + float2);
				double double1 = -1.234567890D;
				double double2 = 1.1111111111122222222222233333333d;
				System.out.println("double1=" + double1);
				System.out.println("double2=" + double2);
				// 无符号数
				char char1 = '2';
				char char2 = 'A';
				char char3 = '我';
				char char4 = 67;
				char char5 = 37211;
				System.out.println("char1=" + char1 + "," + (int)char1);
				System.out.println("char2=" + char2 + "," + (int)char2);
				System.out.println("char3=" + char3 + "," + (int)char3);
				System.out.println("char4=" + char4);
				System.out.println("char5=" + char5);
				// 布尔类型
				boolean boo1 = true;
				boolean boo2 = false;
	}
}
