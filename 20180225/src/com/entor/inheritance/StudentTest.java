package com.entor.inheritance;

public class StudentTest {

	public static void main(String[] args) {
		Person person = new Person("�ְ�");
		person.study();

		Student s = new Student(1, "����", "�������ѧ�뼼��");
		s.study();// �˴����෽����д�˸��෽��

		person = s;// ��̬����1����������ָ���������
		person.study();

		Student s2 = (Student) person;// ��һ����������ָ���˸���ָ����������
		s2.study();

		Teacher t = new Teacher(2, "����");
		t.study();

		person = t;
		person.study();

		Person p = new Person("father");
		Student s3 = (Student) p;// ֱ�ӽ��������ת����������󣬲�����
		s3.study();

		Person p2 = new Student(1, "����", "���繤��");
		p2.study();
	}
}
