package me.tang.exception;

import java.lang.instrument.IllegalClassFormatException;

public class ExceptionTest2 {
	public static void main(String[] args) throws IllegalClassFormatException {
		// ����ʱ�쳣���̳���RuntimeException���쳣��ʵ��
		// throw new RuntimeException("����ʱ�쳣");// ����ʱ�쳣�ڳ����в�Ҫ����
		throw new IllegalClassFormatException("�����쳣");// ������ʱ�쳣ǿ��Ҫ��ʹ���߲�ȡ��ʩ
	}
}
