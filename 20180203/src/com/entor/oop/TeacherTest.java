package com.entor.oop;

/**
 * 老师类测试类
 * 
 * @author Administrator
 *
 */
public class TeacherTest {
	public static void main(String[] args) {
		// 测试代码
		// 1.创建张三老师对象
		Teacher zhangsan = new Teacher();
		// 2.给张三老师的属性进行赋值
		zhangsan.setTno(1001);
		zhangsan.setName("张三");
		zhangsan.setAge(32);
		zhangsan.setHeight(175);
		zhangsan.setWeight(75);
		// 3.使用对象
		System.out.println(zhangsan.getName() + "的工号是：" + zhangsan.getTno());
		// 4.通过System.out.println(zhangsan);得到对象的详细信息
		System.out.println(zhangsan);
		zhangsan.drink();
		zhangsan.eat();
		zhangsan.teach();
	}
}
