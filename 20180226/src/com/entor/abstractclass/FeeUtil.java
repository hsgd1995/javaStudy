package com.entor.abstractclass;

public class FeeUtil {
	/**
	 * ���ݼ��ں��õ�����������
	 * 
	 * @param s
	 * @param count
	 */
	public static void fee(Season s, int count) {
		s.calcFee(count);
	}

	public static void main(String[] args) {
		fee(new Winter(), 10);
		fee(new Summer(), 10);
	}
}
