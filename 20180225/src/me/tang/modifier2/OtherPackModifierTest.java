package me.tang.modifier2;

import me.tang.modifier.Modifier;

/**
 * ���η������ࣺ�ڲ�ͬ�������������Modifier��ĳ�Ա����
 * @author Administrator
 *
 */
public class OtherPackModifierTest {

	public static void main(String[] args) {
		System.out.println("<--�ڲ�ͬ�������������Modifier��ĳ�Ա����-->");
		Modifier modifier = new Modifier();
		
		//����Modifier����ܱ�����Ա����ʱ�������,ֻ��ͨ��getter������ȡ˽�б���
		//System.out.println(modifier.protectedVariable);
		System.out.println("ͨ��getter��������Modifier���ܱ�����Ա������" + modifier.getProtectedVariable());
		
		//����Modifier���Ĭ�����η���Ա����ʱ�������,ֻ��ͨ��getter������ȡ˽�б���
		//System.out.println(modifier.variable);
		System.out.println("ͨ��getter��������Modifier��Ĭ�����η���Ա������"+modifier.getPrivateVariable());
		
		//����Modifier���˽�г�Ա����ʱ�������,ֻ��ͨ��getter������ȡ˽�б���
		//System.out.println(modifier.privateVariable);
		System.out.println("ͨ��getter��������Modifier��˽�г�Ա������"+modifier.getPrivateVariable());
		
		//���Է���Modifier��Ĺ��г�Ա����
		System.out.println(modifier.publicVariable);
		
	}

}
