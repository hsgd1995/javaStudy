package me.tang.wraper;

/**
 * double 包装类
 * 
 * @author Administrator
 *
 */
public class DoubleWraper {
	private double value;

	public DoubleWraper() {
		super();
	}

	public DoubleWraper(double value) {
		super();
		this.value = value;
	}

	public DoubleWraper(String value) {
		super();
		this.value = toDouble(value);
	}

	/**
	 * String 转 double
	 * 
	 * @param value
	 * @return double
	 */
	public double toDouble(String value) {
		int point = value.indexOf(".");
		char[] array = value.toCharArray();
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			int temp = (int) array[i];
			if (array[i] > 48 && array[i] < 57 && i < point) {
				int index = temp - 48;
				int mul = index;
				for (int j = 0; j < point - i - 1; j++) {
					mul *= 10;
				}
				sum += mul;
			} else if (array[i] > 48 && array[i] < 57 && i > point) {
				int index = temp - 48;
				double mul = index;
				for (int j = 0; j < i - point; j++) {
					mul *= 0.1;
				}
				sum += mul;
			} else if (array[i] > 48 && array[i] < 57 || i == point) {
				continue;
			} else {
				throw new RuntimeException(value + "转换失败");
			}
		}
		return sum;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}
