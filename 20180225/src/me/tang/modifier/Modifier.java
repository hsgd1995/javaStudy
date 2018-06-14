package me.tang.modifier;

/**
 * 修饰符类
 * @author Administrator
 *
 */
public class Modifier {
	private String privateVariable = "私有的变量";//私有的变量
	public String publicVariable = "公有的变量";//公有的变量
	protected String protectedVariable = "受保护的变量";//受保护的变量
	String variable = "默认修饰符的变量";//默认修饰符的变量
	
	
	public static void main(String[] args) {
		Modifier modifier = new  Modifier();
		System.out.println("<--在本类访问Modifier类的成员变量-->");
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
