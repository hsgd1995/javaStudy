package me.tang.variable;

/**
 * ����������
 * @author Administrator
 *
 */
public class Variable {
	public static String v_static = "��̬����";// �����

	public String v_member = "��Ա����";// ��Ա����

	public static void output(String v_param) {// �ֲ�����������
		String v_local = "�ֲ�����_������ж���";// �ֲ�����
		System.out.println(v_param + " ," + v_local);
		int i;
		for (i = 1; i <= 2; i++) {// i����for�����ڵľֲ�����
			System.out.println(v_static);
		}
		System.out.println(i);// �����Ҫ�������ⲿ���ʱ�������������������--������������ܹ����ʵķ�Χ��������/����
	}

	// ��̬���������ھ�̬�����з���
	public static void outputStaticVariable() {
		System.out.println(v_static);
	}

	// ��̬���������ڳ�Ա�����з���
	public void outputStaticVariable2() {
		System.out.println(v_static);
	}

	// ��Ա���������ڳ�Ա�����з���
	public String getV_member() {
		return v_member;
	}
}
