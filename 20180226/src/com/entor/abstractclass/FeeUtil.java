package com.entor.abstractclass;

public class FeeUtil {
	/**
	 * 根据季节和用电度数计算费用
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
