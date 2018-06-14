package com.entor.practices;

/**
 * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 
 * @author Administrator
 *
 */
public class PracticeTest {
	public static void main(String[] args) {
		// 百位、十位、个位都可能是1-4
		int count = 0;
		for (int i = 1; i <= 4; i++) {
			// i是百位
			for (int j = 1; j <= 4; j++) {
				// j是十位
				if (i == j) {
					continue;
				}
				for (int k = 1; k <= 4; k++) {
					// k是个位
					if (i == k || j == k) {
						continue;
					}
					count++;
					System.out.println("符合条件的三位数：" + (100 * i + 10 * j + k));
				}
			}
		}
		System.out.println("符合条件的三位数的个数：" + count);

		System.out.println(1 / 0.0);
	}
}
