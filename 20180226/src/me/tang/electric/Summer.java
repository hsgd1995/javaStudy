package me.tang.electric;

/**
 * �ļ�
 * 
 * @author Administrator
 *
 */
public class Summer extends Season {

	public Summer() {
		super();
	}

	/**
	 * ������
	 */
	@Override
	public void calcFee(int i) {
		System.out.println("�ļ����Ϊ��" + PRICE * i);
	}

}
