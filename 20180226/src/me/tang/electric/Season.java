package me.tang.electric;

/**
 * ����
 * 
 * @author Administrator
 *
 */
public abstract class Season {
	public static final double PRICE = 0.49;// ��Ѽ۸�

	public Season() {
		super();
	}

	/**
	 * ������
	 * 
	 * @param i
	 * @return
	 */
	public abstract void calcFee(int i);

}
