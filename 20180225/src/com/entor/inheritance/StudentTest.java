package com.entor.inheritance;

public class StudentTest {

	public static void main(String[] args) {
		Person person = new Person("爸爸");
		person.study();

		Student s = new Student(1, "张三", "计算机科学与技术");
		s.study();// 此处子类方法重写了父类方法

		person = s;// 多态现象1：父类引用指向子类对象
		person.study();

		Student s2 = (Student) person;// 另一个子类引用指向了父类指向的子类对象
		s2.study();

		Teacher t = new Teacher(2, "李四");
		t.study();

		person = t;
		person.study();

		Person p = new Person("father");
		Student s3 = (Student) p;// 直接将父类对象转换成子类对象，不可行
		s3.study();

		Person p2 = new Student(1, "王五", "网络工程");
		p2.study();
	}
}
