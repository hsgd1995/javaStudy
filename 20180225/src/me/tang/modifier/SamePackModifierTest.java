package me.tang.modifier;

/**
 * ���η������ࣺ��ͬһ�������������Modifier��ĳ�Ա����
 * @author Administrator
 *
 */
public class SamePackModifierTest {

	public static void main(String[] args) {
		System.out.println("<--��ͬһ�������������Modifier��ĳ�Ա����-->");
		Modifier modifier = new Modifier();
		System.out.println(modifier.protectedVariable);
		System.out.println(modifier.publicVariable);
		System.out.println(modifier.variable);
		//System.out.println(modifier.privateVariable);
		//����Modifier���˽�г�Ա����ʱ�������,ֻ��ͨ��getter������ȡ˽�б���
		System.out.println("ͨ��getter��������Modifier��˽�б�����"+modifier.getPrivateVariable());
	}

}
