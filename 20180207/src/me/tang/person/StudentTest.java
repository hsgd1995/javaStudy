package me.tang.person;

/**
 * ���� ��student�Ĳ�����
 * @author Administrator
 *
 */
public class StudentTest  {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(20);
		s.setName("����");
		s.setSex(0);
		s.setSno(2222);
		System.out.println(s);
		s.eat();
		s.study();
	}
}
