package me.tang.door;

/**
 * ������
 * 
 * @author Administrator
 *
 */
public class SecurityDoor extends Door implements Warn {

	public SecurityDoor() {
		super();
	}

	public SecurityDoor(String type) {
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
		System.out.println(getType() + "�ָ���¥�������ڣ�");
	}

}
