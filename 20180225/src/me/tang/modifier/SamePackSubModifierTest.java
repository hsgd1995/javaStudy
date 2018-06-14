package me.tang.modifier;

/**
 * 
 * 修饰符测试类：在同一包的子类访问Modifier类的成员变量
 * @author Administrator
 *
 */
public class SamePackSubModifierTest extends Modifier{

	public static void main(String[] args) {
		SamePackSubModifierTest modifier = new SamePackSubModifierTest();
		System.out.println("<--在同一包的子类访问Modifier类的成员变量-->");
		System.out.println(modifier.protectedVariable);
		System.out.println(modifier.publicVariable);
		System.out.println(modifier.variable);
		
		//访问父类Modifier的私有成员变量时编译出错,只能通过getter方法获取私有变量
		//System.out.println(modifier.privateVariable);
		System.out.println("通过getter方法访问父类Modifier的私有变量："+modifier.getPrivateVariable());
	}
}
