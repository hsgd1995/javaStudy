package me.tang.cycle;

/**
 * whileѭ������1-100������
 * @author Administrator
 *
 */
public class CycleTest4 {

	public static void main(String[] args) {
		// ��ʽһ
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i += 2;
		}
		System.out.println("������sum��" + sum);
		
		int j =1;
		int sum1 = 0;
		while(j <= 100){
			if(j % 2 ==1){
				sum1 += j;
				
			}
			j++;
		}
		System.out.println("sum1:"+sum1);
	}

}
