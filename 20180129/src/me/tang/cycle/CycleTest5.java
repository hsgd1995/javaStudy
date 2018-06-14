package me.tang.cycle;

/**
 * do-while计算1-100奇数和
 * @author Administrator
 *
 */
public class CycleTest5 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		do {
			sum += i;
			i += 2;
		} while (i <= 100);
		System.out.println("奇数和sum:" + sum);
	}

}
