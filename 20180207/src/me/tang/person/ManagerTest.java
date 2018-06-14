package me.tang.person;

/**
 * 经理测试类
 * @author Administrator
 *
 */
public class ManagerTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.setAge(30);
		m.setMno("1000");
		m.setName("张三");
		m.manager();
		m.work();
		System.out.println(m);
	}

}
