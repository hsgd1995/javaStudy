package me.tang.variable;

/**
 * ���������������
 * @author Administrator
 *
 */
public class VariableTest {

	public static void main(String[] args) {
		// 1.���������
				// ��̬��ʽ���ʣ�
				System.out.println(Variable.v_static);
				// ��̬�������ʣ�
				Variable.outputStaticVariable();
				// ������ʣ�
				Variable variable = new Variable();
				variable.v_static = "����variable�޸��˾�̬����v_static";
				Variable variable2 = new Variable();
				System.out.println(variable2.v_static);
				// ��Ա�������ʣ�
				variable.outputStaticVariable2();

				// 2.���ʳ�Ա����
				// ������ʣ�
				System.out.println(variable.v_member);
				// ��Ա�������ʣ�
				System.out.println(variable.getV_member());
				// ��ͬ�����з��ʣ�
				variable.v_member = "variable��v_member" + variable.v_member;
				System.out.println(variable.v_member);
				System.out.println(variable2.v_member);
				
				// 3.���ʾֲ�����
				// �������ʡ��������ʣ�
				Variable.output("����");
	}

}
