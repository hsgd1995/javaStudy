package me.tang.cycle;

/**
 * break������ѭ���ṹ ����1-100�ĺͣ����ʹ���1000��ʱ�������������յĽ�������һ�μӺ͵���
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
		System.out.println("���һ��i��ֵ��" + (i - 1));
		System.out.println("���sum:" + sum);
	}

}
