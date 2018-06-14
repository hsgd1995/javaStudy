package com.entor.wraper;

/**
 * int包装类
 * 
 * @author Administrator
 *
 */
public class IntWraper {
	private int value;

	public IntWraper() {
	}

	public IntWraper(int value) {
		super();
		this.value = value;
	}

	public IntWraper(String value) {
		super();
		this.value = parseInt(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static int parseInt(String string) {
		char[] array = string.toCharArray();
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			int cc = (int) array[index];
			if (cc >= 48 && (int) cc <= 57) {
				int temp = cc - 48;
				for (int i = 1; i <= array.length - index - 1; i++) {
					temp *= 10;
				}
				sum += temp;
			} else {
				throw new RuntimeException(new String(array) + "转换失败！");
			}
		}
		return sum;
	}
}
