package me.tang.cycle;

/**
 * ����1-100�ĺ�
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
		System.out.println("����ͣ�" + sum);
	}

}
