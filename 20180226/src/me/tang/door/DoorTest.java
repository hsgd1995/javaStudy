package me.tang.door;

/**
 * 测试类
 * 
 * @author Administrator
 *
 */
public class DoorTest {

	public static void main(String[] args) {
		// 防盗门
		SecurityDoor securityDoor = new SecurityDoor("防盗门");
		securityDoor.alarm();
		securityDoor.divide();
		// 卷帘门
		Roll_UpDoor roll_UpDoor = new Roll_UpDoor("卷帘门");
		roll_UpDoor.alarm();
		roll_UpDoor.divide();
		// 房门
		RoomDoor roomDoor = new RoomDoor("房门");
		roomDoor.divide();

	}

}
