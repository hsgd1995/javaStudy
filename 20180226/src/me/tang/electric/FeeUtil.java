package me.tang.electric;

/**
 * π§æﬂ¿‡
 * 
 * @author Administrator
 *
 */
public class FeeUtil {

	public void fee(Season s, int count) {
		s.calcFee(count);
	}

	public static void main(String[] args) {
		FeeUtil feeUtil = new FeeUtil();
		feeUtil.fee(new Winter(), 125);
		feeUtil.fee(new Summer(), 125);
	}

}
