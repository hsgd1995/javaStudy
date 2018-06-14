package me.tang.variable;

/**
 * 变量作用域
 * @author Administrator
 *
 */
public class Variable {
	public static String v_static = "静态变量";// 类变量

	public String v_member = "成员变量";// 成员变量

	public static void output(String v_param) {// 局部变量：参数
		String v_local = "局部变量_程序块中定义";// 局部变量
		System.out.println(v_param + " ," + v_local);
		int i;
		for (i = 1; i <= 2; i++) {// i属于for语句快内的局部变量
			System.out.println(v_static);
		}
		System.out.println(i);// 如果需要在语句块外部访问变量，必须增大作用域--将变量提出到能够访问的范围进行声明/定义
	}

	// 静态变量可以在静态方法中访问
	public static void outputStaticVariable() {
		System.out.println(v_static);
	}

	// 静态变量可以在成员方法中访问
	public void outputStaticVariable2() {
		System.out.println(v_static);
	}

	// 成员变量可以在成员方法中访问
	public String getV_member() {
		return v_member;
	}
}
