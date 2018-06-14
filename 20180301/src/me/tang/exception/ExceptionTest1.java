package me.tang.exception;

import java.lang.instrument.IllegalClassFormatException;

/**
 * �쳣������
 * 
 * @author Administrator
 *
 */
public class ExceptionTest1 {

	public static void throwRuntime() {
		throw new RuntimeException("throw �׳�����ʱ�쳣��RuntimeException");
	}

	public static void throwIllegalClassFormat() throws IllegalClassFormatException {
		throw new IllegalClassFormatException("throw �׳�������ʱ�쳣��IllegalClassFormatException");
	}

	public static void catchIllegalClassFormat() {
		try {
			throw new IllegalClassFormatException("catch ���������ʱ�쳣��IllegalClassFormatException");
		} catch (IllegalClassFormatException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IllegalClassFormatException {
		// throwRuntime();
		// throwIllegalClassFormat();
		catchIllegalClassFormat();
		System.out.println("�������");

	}

}
