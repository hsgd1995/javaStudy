package me.tang.cycle;

/**
 * continue:计算1-100的和，55不参与计算
 * 
 * @author Administrator
 *
 */
public class CycleTest6 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		for (; i <= 100; i++) {
			if (i == 55) {
				continue;
			}
			sum += i;
		}
		System.out.println("sum:" + sum);

		int sum2 = 0;
		int j = 1;
		while (j <= 100) {
			if (j == 55) {
				j++;
				continue;
			}
			sum2 += j;
			j++;
		}
		System.out.println("sum2:" + sum2);
	}
}
