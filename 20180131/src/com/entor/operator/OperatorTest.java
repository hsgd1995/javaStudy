package com.entor.operator;

/**
 * ��Ŀ����
 * 
 * @author Administrator
 *
 */
public class OperatorTest {
	public static void main(String[] args) {
		// 60���²�����60���ϼ���
		// 0-59 ������60-80����80-100����
		int score = 77;
		String r1 = score >= 60 ? "����" : "������";
		System.out.println(r1);

		String r2 = score > 100 || score < 0 ? "������ķ���" : (score >= 80 ? "����" : (score >= 60 ? "����" : "������"));
		System.out.println(r2);
	}
}
