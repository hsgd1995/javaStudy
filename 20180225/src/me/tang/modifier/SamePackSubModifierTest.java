package me.tang.modifier;

/**
 * 
 * ���η������ࣺ��ͬһ�����������Modifier��ĳ�Ա����
 * @author Administrator
 *
 */
public class SamePackSubModifierTest extends Modifier{

	public static void main(String[] args) {
		SamePackSubModifierTest modifier = new SamePackSubModifierTest();
		System.out.println("<--��ͬһ�����������Modifier��ĳ�Ա����-->");
		System.out.println(modifier.protectedVariable);
		System.out.println(modifier.publicVariable);
		System.out.println(modifier.variable);
		
		//���ʸ���Modifier��˽�г�Ա����ʱ�������,ֻ��ͨ��getter������ȡ˽�б���
		//System.out.println(modifier.privateVariable);
		System.out.println("ͨ��getter�������ʸ���Modifier��˽�б�����"+modifier.getPrivateVariable());
	}
}
