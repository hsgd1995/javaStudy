package com.entor.oop;

/**
 * ����վ����Ĳ�����
 * 
 * @author Administrator
 *
 */
public class BusStopBoardTest {
	public static void main(String[] args) {
		// �������������͵ı����� ������������淶
		BusStopBoard lubanlu = new BusStopBoard();
		// ��������ֵ
		lubanlu.setStation("³��·վ");
		lubanlu.setSize(789.5);
		lubanlu.setColor("�������");
		lubanlu.setInformation("85·���Ӱٻ���·��³��·��16·��������������������");
		// ��ȡ��������������ֵ
		System.out.println(lubanlu.getInformation());
		// �������ȫ����Ϣ
		System.out.println(lubanlu);
		// �����Զ��巽��
		lubanlu.provideBusStop();
		lubanlu.provideRest();
		BusStopBoard daxuelu = new BusStopBoard();
		// ��������ֵ
		daxuelu.setStation("��ѧ·վ");
		daxuelu.setSize(789.5);
		daxuelu.setColor("�������");
		daxuelu.setInformation("85·���Ӱٻ���·��³��·��16·��������������������");
		// ��ȡ��������������ֵ
		System.out.println(daxuelu.getInformation());
		// �������ȫ����Ϣ
		System.out.println(daxuelu);
		// �����Զ��巽��
		daxuelu.provideBusStop();
		daxuelu.provideRest();
	}
}
