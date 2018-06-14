package me.tang.cycle;

/**
 * for循环计算1-100偶数和
 * 
 * @author Administrator
 *
 */
public class CycleTest3 {

	public static void main(String[] args) {
		//方法一
		int sum = 0;//和变量
		for (int i = 1; i <= 100; i++) {//定义循环变量、循环条件
			if (i % 2 == 0) {
				System.out.println("i:" + i);
				sum += i;
			}
		}
		System.out.println("偶数和sum:" + sum);//输出和
		
		//方法二
		int sum2 = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum2 += i;
		}
		System.out.println("偶数和sum2:" + sum2);
	}

}
