package com.entor.array;

import java.util.Arrays;

/**
 * 
 * ˫ɫ��:��1-33���������ѡȡ6����ͬ���룬��1-16���������ѡȡ1�����룬��������ϵõ����յ��н����롣
 * 
 * @author Administrator
 *
 */
public class ArrayTest12 {
	public static void main(String[] args) {
		// ��ɫ����
		int[] blueBalls = new int[16];
		for (int i = 0; i < blueBalls.length; i++) {
			blueBalls[i] = i + 1;
		}
		System.out.println("��ɫ���飺" + Arrays.toString(blueBalls));
		// ��ɫ����
		int[] redBalls = new int[33];
		for (int i = 0; i < redBalls.length; i++) {
			redBalls[i] = i + 1;
		}
		System.out.println("��ɫ���飺" + Arrays.toString(redBalls));
		// ����
		int[] pool = new int[7];
		// ѡ�ر����
		int blueIndex = (int) (Math.random() * 16);// [0,15]
		pool[pool.length - 1] = blueBalls[blueIndex];

		// ѡ��ͨ����(�ų��ظ�ѡ��)
		for (int i = 0; i < pool.length - 1; i++) {
			while (true) {
				int redIndex = (int) (Math.random() * 33);// [0,32]
				// ��Ǳ�ѡ�����򣬽�ѡ������ĺ�����Ϊ0
				if (redBalls[redIndex] != 0) {
					pool[i] = redBalls[redIndex];
					redBalls[redIndex] = 0;// ѡ��������Ϊ0
					break;// ������ǰ��ѡ��
				}
			}
		}

		// ����н�����
		System.out.println("�����н����룺" + Arrays.toString(pool));
	}
}
