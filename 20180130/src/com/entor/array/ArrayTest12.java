package com.entor.array;

import java.util.Arrays;

/**
 * 
 * 双色球:从1-33号球中随机选取6个不同号码，从1-16号球中随机选取1个号码，将它们组合得到最终的中奖号码。
 * 
 * @author Administrator
 *
 */
public class ArrayTest12 {
	public static void main(String[] args) {
		// 蓝色球组
		int[] blueBalls = new int[16];
		for (int i = 0; i < blueBalls.length; i++) {
			blueBalls[i] = i + 1;
		}
		System.out.println("蓝色球组：" + Arrays.toString(blueBalls));
		// 红色球组
		int[] redBalls = new int[33];
		for (int i = 0; i < redBalls.length; i++) {
			redBalls[i] = i + 1;
		}
		System.out.println("红色球组：" + Arrays.toString(redBalls));
		// 奖池
		int[] pool = new int[7];
		// 选特别号码
		int blueIndex = (int) (Math.random() * 16);// [0,15]
		pool[pool.length - 1] = blueBalls[blueIndex];

		// 选普通号码(排除重复选球)
		for (int i = 0; i < pool.length - 1; i++) {
			while (true) {
				int redIndex = (int) (Math.random() * 33);// [0,32]
				// 标记被选过的球，将选过的球的号码置为0
				if (redBalls[redIndex] != 0) {
					pool[i] = redBalls[redIndex];
					redBalls[redIndex] = 0;// 选过的球，置为0
					break;// 结束当前次选球
				}
			}
		}

		// 输出中奖号码
		System.out.println("本期中奖号码：" + Arrays.toString(pool));
	}
}
