package com.entor.practices;

/**
 * 
 * @author Administrator
 *
 */
public class PracticeTest2 {
	public static void main(String[] args) {
		// 假设利润
		double profit = 120;
		double comm = 0;
		if (profit <= 10) {
			comm = profit * 0.1;
		} else if (profit <= 20) {
			comm = 10 * 0.1 + (profit - 10) * 0.075;
		} else if (profit <= 40) {
			comm = 10 * 0.1 + 10 * 0.075 + (profit - 40) * 0.05;
		} else if (profit <= 60) {
			comm = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (profit - 60) * 0.03;
		} else if (profit <= 100) {
			comm = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + (profit - 60) * 0.015;
		} else {
			comm = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + 40 * 0.015 + (profit - 100) * 0.01;
		}
		System.out.println(profit + "万的奖金是：" + comm);
	}
}
