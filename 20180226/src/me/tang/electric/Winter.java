package me.tang.electric;

/**
 * ����
 * 
 * @author Administrator
 *
 */
public class Winter extends Season {

	public Winter() {
		super();
	}

	/**
	 * ������
	 */
	@Override
	public void calcFee(int i) {
		System.out.println("�������Ϊ��" + PRICE * (i + 20));
	}

}
