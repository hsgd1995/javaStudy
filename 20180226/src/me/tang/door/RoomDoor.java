package me.tang.door;

/**
 * ����
 * 
 * @author Administrator
 *
 */
public class RoomDoor extends Door {

	public RoomDoor() {
		super();
	}

	public RoomDoor(String type) {
		super(type);
	}

	/**
	 * �ָ�
	 */
	@Override
	public void divide() {
		System.out.println(getType() + "�ָ��˿��������ң�");
	}

}
