package me.tang.polymorphism;

/**
 * Eclipse�༭��
 * 
 * @author Administrator
 *
 */
public class Eclipse extends Environment {

	public Eclipse(String name) {
		super(name);
	}

	/**
	 * F1���ʱ��
	 */
	@Override
	public void dealWithClickF1() {
		System.out.println("��" + getName() + "�е��F1������help���ڣ�");
	}
}
