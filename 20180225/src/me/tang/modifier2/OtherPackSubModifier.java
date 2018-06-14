package me.tang.modifier2;

import me.tang.modifier.Modifier;

/**
 * 
 * 修饰符测试类：在不同包的子类访问Modifier类的成员变量
 * 
 * @author Administrator
 *
 */
public class OtherPackSubModifier extends Modifier {

	public static void main(String[] args) {
		System.out.println("<--在不同包的子类访问Modifier类的成员变量-->");
		OtherPackSubModifier subModifier = new OtherPackSubModifier();
		System.out.println(subModifier.protectedVariable);
		System.out.println(subModifier.publicVariable);

		// 访问父类Modifier的默认修饰符成员变量时编译出错,只能通过getter方法获取私有变量
		// System.out.println(subModifier.variable);
		System.out.println("通过getter方法访问父类Modifier的默认修饰符成员变量：" + subModifier.getVariable());
		
		// 访问父类Modifier的私有成员变量时编译出错,只能通过getter方法获取私有变量
		//System.out.println(subModifier.privateVariable);
		System.out.println("通过getter方法访问父类Modifier的私有成员变量：" + subModifier.getPrivateVariable());

	}

}
