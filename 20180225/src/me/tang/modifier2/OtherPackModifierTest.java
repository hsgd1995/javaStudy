package me.tang.modifier2;

import me.tang.modifier.Modifier;

/**
 * 修饰符测试类：在不同包的其他类访问Modifier类的成员变量
 * @author Administrator
 *
 */
public class OtherPackModifierTest {

	public static void main(String[] args) {
		System.out.println("<--在不同包的其他类访问Modifier类的成员变量-->");
		Modifier modifier = new Modifier();
		
		//访问Modifier类的受保护成员变量时编译出错,只能通过getter方法获取私有变量
		//System.out.println(modifier.protectedVariable);
		System.out.println("通过getter方法访问Modifier的受保护成员变量：" + modifier.getProtectedVariable());
		
		//访问Modifier类的默认修饰符成员变量时编译出错,只能通过getter方法获取私有变量
		//System.out.println(modifier.variable);
		System.out.println("通过getter方法访问Modifier的默认修饰符成员变量："+modifier.getPrivateVariable());
		
		//访问Modifier类的私有成员变量时编译出错,只能通过getter方法获取私有变量
		//System.out.println(modifier.privateVariable);
		System.out.println("通过getter方法访问Modifier的私有成员变量："+modifier.getPrivateVariable());
		
		//可以访问Modifier类的公有成员变量
		System.out.println(modifier.publicVariable);
		
	}

}
