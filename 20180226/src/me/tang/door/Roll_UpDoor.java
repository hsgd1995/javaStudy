package me.tang.door;

/**
 * 卷帘门
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
	 * 警报
	 */
	@Override
	public void alarm() {
		System.out.println(getType() + "处发生警报！");

	}

	/**
	 * 分隔
	 */
	@Override
	public void divide() {
		System.out.println(getType() + "分隔了街道和车库！");

	}

}
