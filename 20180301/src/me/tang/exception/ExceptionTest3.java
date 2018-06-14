package me.tang.exception;

import java.lang.instrument.IllegalClassFormatException;

/**
 * 异常处理方式
 * 
 * @author Administrator
 *
 */
public class ExceptionTest3 {
	// 抛出的异常，是将异常相关信息交给调用端处理
	public static void throwRuntime() throws RuntimeException {
		throw new RuntimeException("通过throws关键字抛出的异常");
	}

	public static void tryCatchRuntime() {
		try {
			throw new RuntimeException("通过try-catch块处理的异常");
		} catch (RuntimeException re) {
			re.printStackTrace();// 输出异常信息
		}
	}

	public static void throwIllegal() throws IllegalClassFormatException {
		throw new IllegalClassFormatException("通过throws关键字抛出的异常");
	}

	public static void main(String[] args) throws IllegalClassFormatException {
		// throwRuntime();
		// throwIllegal();
		tryCatchRuntime();
		System.out.println("哎哟，还可以执行！");
	}
}
