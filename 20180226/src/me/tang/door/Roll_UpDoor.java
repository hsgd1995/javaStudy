package me.tang.door;

/**
 * ������
 * 
 * @author Administrator
 *
 */
public class Roll_UpDoor extends Door implements Warn {

	public Roll_UpDoor() {
		super();
	}

	public Roll_UpDoor(String type) {
		super(type);
	}

	/**
	 * ����
	 */
	@Override
	public void alarm() {
		System.out.println(getType() + "������������");

	}

	/**
	 * �ָ�
	 */
	@Override
	public void divide() {
		System.out.println(getType() + "�ָ��˽ֵ��ͳ��⣡");

	}

}
