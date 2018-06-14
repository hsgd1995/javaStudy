package com.entor.abstractclass;

public class Summer extends Season {

	@Override
	public void calcFee(int i) {
		System.out.println("夏季用电" + i + "度，费用：" + PRICE * i);
	}

}
