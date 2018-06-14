package me.tang.person;

/**
 * 子类 ：teacher的测试类
 * @author Administrator
 *
 */
public class TeacherTest  {
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setTno(1111);
		t.setAge(20);
		t.setName("李四");
		t.setSex(0);
		System.out.println(t);
		
		t.eat();
		t.teach();
	}
}
