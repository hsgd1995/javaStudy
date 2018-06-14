package me.tang.cycle;

/**
 * break：跳出循环结构 计算1-100的和，当和大于1000的时候结束，输出最终的结果和最后一次加和的数
 * 
 * @author Administrator
 *
 */
public class CycleTest7 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		for (; i <= 100; i++) {
			if (sum > 1000) {
				break;
			}
			sum += i;
		}
		System.out.println("最后一次i的值：" + (i - 1));
		System.out.println("结果sum:" + sum);
	}

}
