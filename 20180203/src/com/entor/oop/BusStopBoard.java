package com.entor.oop;

/**
 * 公交站牌
 * 
 * @author Administrator
 *
 */
public class BusStopBoard {
	private String station;// 站点
	private double size;// 尺寸
	private String color;// 颜色
	private String information;// 站台信息

	// 方法：提供休息
	public void provideRest() {
		System.out.println(station + "供旅客休息");
	}

	// 方法：供停靠
	public void provideBusStop() {
		System.out.println(station + "供公交车停靠");
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
		return "站牌 [站点=" + station + ", 尺寸=" + size + ", color=" + color + ", information=" + information + "]";
	}

}
