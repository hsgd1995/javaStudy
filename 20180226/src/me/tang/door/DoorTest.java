package me.tang.door;

/**
 * ������
 * 
 * @author Administrator
 *
 */
public class DoorTest {

	public static void main(String[] args) {
		// ������
		SecurityDoor securityDoor = new SecurityDoor("������");
		securityDoor.alarm();
		securityDoor.divide();
		// ������
		Roll_UpDoor roll_UpDoor = new Roll_UpDoor("������");
		roll_UpDoor.alarm();
		roll_UpDoor.divide();
		// ����
		RoomDoor roomDoor = new RoomDoor("����");
		roomDoor.divide();

	}

}
