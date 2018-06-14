package me.tang.door;

/**
 * 防盗门
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
		System.out.println(getType() + "分隔了楼道和屋内！");
	}

}
