package me.tang.electric;

/**
 * 季节
 * 
 * @author Administrator
 *
 */
public abstract class Season {
	public static final double PRICE = 0.49;// 电费价格

	public Season() {
		super();
	}

	/**
	 * 计算电费
	 * 
	 * @param i
	 * @return
	 */
	public abstract void calcFee(int i);

}
