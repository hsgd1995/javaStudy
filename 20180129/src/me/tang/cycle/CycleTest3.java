package me.tang.cycle;

/**
 * forѭ������1-100ż����
 * 
 * @author Administrator
 *
 */
public class CycleTest3 {

	public static void main(String[] args) {
		//����һ
		int sum = 0;//�ͱ���
		for (int i = 1; i <= 100; i++) {//����ѭ��������ѭ������
			if (i % 2 == 0) {
				System.out.println("i:" + i);
				sum += i;
			}
		}
		System.out.println("ż����sum:" + sum);//�����
		
		//������
		int sum2 = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum2 += i;
		}
		System.out.println("ż����sum2:" + sum2);
	}

}
