package me.tang.person;

/**
 * ���� ��teacher�Ĳ�����
 * @author Administrator
 *
 */
public class TeacherTest  {
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setTno(1111);
		t.setAge(20);
		t.setName("����");
		t.setSex(0);
		System.out.println(t);
		
		t.eat();
		t.teach();
	}
}
