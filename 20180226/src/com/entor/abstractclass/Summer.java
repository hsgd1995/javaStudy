package com.entor.abstractclass;

public class Summer extends Season {

	@Override
	public void calcFee(int i) {
		System.out.println("�ļ��õ�" + i + "�ȣ����ã�" + PRICE * i);
	}

}
