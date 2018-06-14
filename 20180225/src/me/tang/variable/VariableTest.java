package me.tang.variable;

/**
 * 变量作用域测试类
 * @author Administrator
 *
 */
public class VariableTest {

	public static void main(String[] args) {
		// 1.访问类变量
				// 静态方式访问：
				System.out.println(Variable.v_static);
				// 静态方法访问：
				Variable.outputStaticVariable();
				// 对象访问：
				Variable variable = new Variable();
				variable.v_static = "对象variable修改了静态变量v_static";
				Variable variable2 = new Variable();
				System.out.println(variable2.v_static);
				// 成员方法访问：
				variable.outputStaticVariable2();

				// 2.访问成员变量
				// 对象访问：
				System.out.println(variable.v_member);
				// 成员方法访问：
				System.out.println(variable.getV_member());
				// 不同对象中访问：
				variable.v_member = "variable的v_member" + variable.v_member;
				System.out.println(variable.v_member);
				System.out.println(variable2.v_member);
				
				// 3.访问局部变量
				// 方法访问、程序块访问：
				Variable.output("参数");
	}

}
