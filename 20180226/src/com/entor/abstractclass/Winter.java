package com.entor.abstractclass;

public class Winter extends Season {

	@Override
	public void calcFee(int i) {
		System.out.println("�����õ�" + i + "�ȣ����ã�" + PRICE * (i + 20));
	}

}
