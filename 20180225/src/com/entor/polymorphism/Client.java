package com.entor.polymorphism;

public class Client {
	// ��Environment�е��F1
	public void click(Environment env) {
		// env = new Eclipse("Neon.3 Release (4.6.3)");
		// env = new Chrome("64.0.3282.186����ʽ�汾�� ��64 λ��");
		env.afterClickF1();
	}

	public static void main(String[] args) {
		Client c = new Client();
		c.click(new Eclipse("Neon.3 Release (4.6.3)"));
		c.click(new Chrome("64.0.3282.186����ʽ�汾�� ��64 λ��"));
	}
}
