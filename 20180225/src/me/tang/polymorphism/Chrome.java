package me.tang.polymorphism;

/**
 * Chrome�����
 * 
 * @author Administrator
 *
 */
public class Chrome extends Environment {

	public Chrome(String name) {
		super(name);
	}

	/**
	 * F1����¼�
	 */
	@Override
	public void dealWithClickF1() {
		System.out.println("��" + getName() + "�е��F1����������ҳhttps://support.google.com/chrome/?p=help&ctx=keyboard");
	}
}
