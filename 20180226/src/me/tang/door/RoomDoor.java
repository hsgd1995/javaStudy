package me.tang.door;

/**
 * 房门
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
	 * 分隔
	 */
	@Override
	public void divide() {
		System.out.println(getType() + "分隔了客厅和卧室！");
	}

}
