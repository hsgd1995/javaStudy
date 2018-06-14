package com.entor.wraper;

public class DoubleWraper {
	private double value;

	public DoubleWraper() {
	}

	public DoubleWraper(double value) {
		super();
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public static double parseDouble(char cha) {
		return cha;
	}

	public static double parseDouble(String string) {// 3.14
		// 1.分割字符串
		String[] arr = string.split("\\.");
		// 得到整数部分的字符串和小数部分的字符串
		String int_str = arr[0];
		String dou_str = arr[1];
		// 2.将整数字符串转成数字
		double dou_int = IntWraper.parseInt(int_str);
		// 3.将小数部分转成数字
		double dou_dec = transFromDecimalToDouble(dou_str);
		return dou_int + dou_dec;
	}

	private static double transFromDecimalToDouble(String dou_str) {
		// 1.将小数字符串转成数组
		char[] array = dou_str.toCharArray();
		// 2.字符转成小数
		double sum = 0;
		for (int index = 0; index < array.length; index++) {
			double cc = (double) array[index];
			if (cc >= 48 && (int) cc <= 57) {
				double temp = cc - 48;
				for (int i = 1; i <= index + 1; i++) {
					temp /= 10;
				}
				sum += temp;
			} else {
				throw new RuntimeException(new String(array) + "转换失败！");
			}
		}
		return sum;
	}
}
