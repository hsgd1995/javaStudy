package com.entor.oop;

/**
 * ��ʦ�������
 * 
 * @author Administrator
 *
 */
public class TeacherTest {
	public static void main(String[] args) {
		// ���Դ���
		// 1.����������ʦ����
		Teacher zhangsan = new Teacher();
		// 2.��������ʦ�����Խ��и�ֵ
		zhangsan.setTno(1001);
		zhangsan.setName("����");
		zhangsan.setAge(32);
		zhangsan.setHeight(175);
		zhangsan.setWeight(75);
		// 3.ʹ�ö���
		System.out.println(zhangsan.getName() + "�Ĺ����ǣ�" + zhangsan.getTno());
		// 4.ͨ��System.out.println(zhangsan);�õ��������ϸ��Ϣ
		System.out.println(zhangsan);
		zhangsan.drink();
		zhangsan.eat();
		zhangsan.teach();
	}
}
