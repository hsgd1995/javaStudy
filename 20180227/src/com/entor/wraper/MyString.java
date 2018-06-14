package com.entor.wraper;

public class MyString {
	private String value;

	public MyString() {
	}

	public MyString(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static int toInt(String value) {
		return stringToInt(value.toCharArray());
	}

	private static int stringToInt(char[] array) {
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			int cc = (int) array[index];
			if (cc >= 48 && (int) cc <= 57) {
				int temp = cc-48;
				for (int i = 1; i <= array.length - index - 1; i++) {
					temp *= 10;
				}
				sum += temp;
			} else {
				throw new RuntimeException(new String(array) + "×ª»»Ê§°Ü£¡");
			}
		}
		return sum;
	}
}
