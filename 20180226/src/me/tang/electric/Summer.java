package me.tang.electric;

/**
 * 夏季
 * 
 * @author Administrator
 *
 */
public class Summer extends Season {

	public Summer() {
		super();
	}

	/**
	 * 计算电费
	 */
	@Override
	public void calcFee(int i) {
		System.out.println("夏季电费为：" + PRICE * i);
	}

}
