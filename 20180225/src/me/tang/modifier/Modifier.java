package me.tang.modifier;

/**
 * ���η���
 * @author Administrator
 *
 */
public class Modifier {
	private String privateVariable = "˽�еı���";//˽�еı���
	public String publicVariable = "���еı���";//���еı���
	protected String protectedVariable = "�ܱ����ı���";//�ܱ����ı���
	String variable = "Ĭ�����η��ı���";//Ĭ�����η��ı���
	
	
	public static void main(String[] args) {
		Modifier modifier = new  Modifier();
		System.out.println("<--�ڱ������Modifier��ĳ�Ա����-->");
		System.out.println(modifier.privateVariable);
		System.out.println(modifier.publicVariable);
		System.out.println(modifier.protectedVariable);
		System.out.println(modifier.variable);
	}

/**              getter and setter               **/
	public String getPrivateVariable() {
		return privateVariable;
	}


	public void setPrivateVariable(String privateVariable) {
		this.privateVariable = privateVariable;
	}


	public String getPublicVariable() {
		return publicVariable;
	}


	public void setPublicVariable(String publicVariable) {
		this.publicVariable = publicVariable;
	}


	public String getProtectedVariable() {
		return protectedVariable;
	}


	public void setProtectedVariable(String protectedVariable) {
		this.protectedVariable = protectedVariable;
	}


	public String getVariable() {
		return variable;
	}


	public void setVariable(String variable) {
		this.variable = variable;
	}
	
}
