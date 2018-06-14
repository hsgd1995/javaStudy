package me.tang.modifier;

/**
 * 修饰符测试类：在同一包的其他类访问Modifier类的成员变量
 * @author Administrator
 *
 */
public class SamePackModifierTest {

	public static void main(String[] args) {
		System.out.println("<--在同一包的其他类访问Modifier类的成员变量-->");
		Modifier modifier = new Modifier();
		System.out.println(modifier.protectedVariable);
		System.out.println(modifier.publicVariable);
		System.out.println(modifier.variable);
		//System.out.println(modifier.privateVariable);
		//访问Modifier类的私有成员变量时编译出错,只能通过getter方法获取私有变量
		System.out.println("通过getter方法访问Modifier的私有变量："+modifier.getPrivateVariable());
	}

}
