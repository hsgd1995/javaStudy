package me.tang.exception;

import java.lang.instrument.IllegalClassFormatException;

/**
 * 异常测试类
 * 
 * @author Administrator
 *
 */
public class ExceptionTest1 {

	public static void throwRuntime() {
		throw new RuntimeException("throw 抛出运行时异常：RuntimeException");
	}

	public static void throwIllegalClassFormat() throws IllegalClassFormatException {
		throw new IllegalClassFormatException("throw 抛出非运行时异常：IllegalClassFormatException");
	}

	public static void catchIllegalClassFormat() {
		try {
			throw new IllegalClassFormatException("catch 捕获非运行时异常：IllegalClassFormatException");
		} catch (IllegalClassFormatException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IllegalClassFormatException {
		// throwRuntime();
		// throwIllegalClassFormat();
		catchIllegalClassFormat();
		System.out.println("测试语句");

	}

}
