package me.tang.modifier2;

import me.tang.modifier.Modifier;

/**
 * 
 * ���η������ࣺ�ڲ�ͬ�����������Modifier��ĳ�Ա����
 * 
 * @author Administrator
 *
 */
public class OtherPackSubModifier extends Modifier {

	public static void main(String[] args) {
		System.out.println("<--�ڲ�ͬ�����������Modifier��ĳ�Ա����-->");
		OtherPackSubModifier subModifier = new OtherPackSubModifier();
		System.out.println(subModifier.protectedVariable);
		System.out.println(subModifier.publicVariable);

		// ���ʸ���Modifier��Ĭ�����η���Ա����ʱ�������,ֻ��ͨ��getter������ȡ˽�б���
		// System.out.println(subModifier.variable);
		System.out.println("ͨ��getter�������ʸ���Modifier��Ĭ�����η���Ա������" + subModifier.getVariable());
		
		// ���ʸ���Modifier��˽�г�Ա����ʱ�������,ֻ��ͨ��getter������ȡ˽�б���
		//System.out.println(subModifier.privateVariable);
		System.out.println("ͨ��getter�������ʸ���Modifier��˽�г�Ա������" + subModifier.getPrivateVariable());

	}

}
