package me.tang.exception;

import java.lang.instrument.IllegalClassFormatException;

/**
 * �쳣����ʽ
 * 
 * @author Administrator
 *
 */
public class ExceptionTest3 {
	// �׳����쳣���ǽ��쳣�����Ϣ�������ö˴���
	public static void throwRuntime() throws RuntimeException {
		throw new RuntimeException("ͨ��throws�ؼ����׳����쳣");
	}

	public static void tryCatchRuntime() {
		try {
			throw new RuntimeException("ͨ��try-catch�鴦����쳣");
		} catch (RuntimeException re) {
			re.printStackTrace();// ����쳣��Ϣ
		}
	}

	public static void throwIllegal() throws IllegalClassFormatException {
		throw new IllegalClassFormatException("ͨ��throws�ؼ����׳����쳣");
	}

	public static void main(String[] args) throws IllegalClassFormatException {
		// throwRuntime();
		// throwIllegal();
		tryCatchRuntime();
		System.out.println("��Ӵ��������ִ�У�");
	}
}
