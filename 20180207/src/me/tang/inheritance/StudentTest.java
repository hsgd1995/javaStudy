package me.tang.inheritance;


/**
 * ����Student������
 * 
 * @author Administrator
 *
 */
public class StudentTest {
	public static void main(String[] args) {
		// 1.��������
		Student s = new Student();
		// 2.���÷���
		s.setSno(2017090706);
		s.setName("����");
		s.setAge(30);
		// 3.�������
		System.out.println(s);
		// 4.���÷���
		s.eat();
		s.study();
	}
}
