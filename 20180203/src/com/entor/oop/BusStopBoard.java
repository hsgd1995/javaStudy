package com.entor.oop;

/**
 * ����վ��
 * 
 * @author Administrator
 *
 */
public class BusStopBoard {
	private String station;// վ��
	private double size;// �ߴ�
	private String color;// ��ɫ
	private String information;// վ̨��Ϣ

	// �������ṩ��Ϣ
	public void provideRest() {
		System.out.println(station + "���ÿ���Ϣ");
	}

	// ��������ͣ��
	public void provideBusStop() {
		System.out.println(station + "��������ͣ��");
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	@Override
	public String toString() {
		return "վ�� [վ��=" + station + ", �ߴ�=" + size + ", color=" + color + ", information=" + information + "]";
	}

}
