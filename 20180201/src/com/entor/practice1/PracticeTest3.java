package com.entor.practice1;

/**
 * 13.Ϊָ���ɼ��ӷ֣�ֱ���������ڵ��� 60 Ϊֹ������ӷ�ǰ�ͼӷֺ�ĳɼ�����ͳ�ƼӷֵĴ���
 * 
 * @author Administrator
 *
 */
public class PracticeTest3 {
	public static void main(String[] args) {
		int score = 53;// 53�ּӵ�60�֣�����7�Σ�ÿ�μ�1��
		int count = 0;// ͳ�Ƽӷ�����
		int temp = score;// temp��Ϊ������
		while (true) {
			if (temp == 60) {
				break;
			}
			temp++;
			count++;
		}
		System.out.println("�ӷ�ǰ��" + score);
		System.out.println("�ӷֺ�" + temp);
		System.out.println("���ӣ�" + count + "�Σ�");
	}
}
