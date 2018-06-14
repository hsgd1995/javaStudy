package me.tang.cycle;

/**
 * 计算1-100的和
 * 
 * @author Administrator
 *
 */
public class CycleTest2 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		for (; i <= 100; i++) {
			sum += i;
		}
		System.out.println("结果和：" + sum);
	}

}
