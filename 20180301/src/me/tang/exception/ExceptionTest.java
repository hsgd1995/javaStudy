package me.tang.exception;

public class ExceptionTest {
	public static void main(String[] args) throws Throwable {
		// ��ʶ�쳣
		// System.out.println(1 / 0);
		// 1.�쳣��java��ʹ���쳣������
		// 2.�쳣��Ϣ������һЩ�򵥵��ַ�����ֱ�������쳣�Ĵ�������
		// 3.�쳣��Ϣ�л������˷����쳣�Ĵ����
		
		// �쳣���ࣺ����ʱ�쳣��������ʱ�쳣
		// ArithmeticException��Ϊ�����쳣���̳���RuntimeException��
		// RuntimeException��Ϊ����ʱ�쳣�࣬�̳�Exception��
		// Exception��Ϊ�쳣�࣬�̳���Throwable��
		// Throwable�����쳣�Ķ�����
		// Integer.parseInt("abc");
		// NumberFormatException��Ϊ���ָ�ʽ���쳣���̳�RuntimeException��
		
		Throwable t = new Throwable("�����쳣��Ϣ");
		throw t;
	}
}
