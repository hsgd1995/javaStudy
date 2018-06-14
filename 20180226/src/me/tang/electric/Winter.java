package me.tang.electric;

/**
 * 冬季
 * 
 * @author Administrator
 *
 */
public class Winter extends Season {

	public Winter() {
		super();
	}

	/**
	 * 计算电费
	 */
	@Override
	public void calcFee(int i) {
		System.out.println("冬季电费为：" + PRICE * (i + 20));
	}

}
