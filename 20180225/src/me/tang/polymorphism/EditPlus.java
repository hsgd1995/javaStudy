package me.tang.polymorphism;

/**
 * EditPlus�༭��
 * 
 * @author Administrator
 *
 */
public class EditPlus extends Environment {

	public EditPlus(String name) {
		super(name);
	}

	/**
	 * F1���ʱ��
	 */
	@Override
	public void dealWithClickF1() {
		System.out.println("��" + getName() + "�е��F1����������API��");
	}
}
