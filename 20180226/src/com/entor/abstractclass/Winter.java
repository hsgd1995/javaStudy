package com.entor.abstractclass;

public class Winter extends Season {

	@Override
	public void calcFee(int i) {
		System.out.println("冬季用电" + i + "度，费用：" + PRICE * (i + 20));
	}

}
