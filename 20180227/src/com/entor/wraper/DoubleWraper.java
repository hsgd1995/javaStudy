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
		// 1.�ָ��ַ���
		String[] arr = string.split("\\.");
		// �õ��������ֵ��ַ�����С�����ֵ��ַ���
		String int_str = arr[0];
		String dou_str = arr[1];
		// 2.�������ַ���ת������
		double dou_int = IntWraper.parseInt(int_str);
		// 3.��С������ת������
		double dou_dec = transFromDecimalToDouble(dou_str);
		return dou_int + dou_dec;
	}

	private static double transFromDecimalToDouble(String dou_str) {
		// 1.��С���ַ���ת������
		char[] array = dou_str.toCharArray();
		// 2.�ַ�ת��С��
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
				throw new RuntimeException(new String(array) + "ת��ʧ�ܣ�");
			}
		}
		return sum;
	}
}
