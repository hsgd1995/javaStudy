package me.tang.person;

/**
 * 子类 ：student的测试类
 * @author Administrator
 *
 */
public class StudentTest  {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(20);
		s.setName("张三");
		s.setSex(0);
		s.setSno(2222);
		System.out.println(s);
		s.eat();
		s.study();
	}
}
