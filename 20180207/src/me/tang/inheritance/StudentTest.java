package me.tang.inheritance;


/**
 * 子类Student测试类
 * 
 * @author Administrator
 *
 */
public class StudentTest {
	public static void main(String[] args) {
		// 1.创建对象
		Student s = new Student();
		// 2.调用方法
		s.setSno(2017090706);
		s.setName("张三");
		s.setAge(30);
		// 3.输出对象
		System.out.println(s);
		// 4.调用方法
		s.eat();
		s.study();
	}
}
