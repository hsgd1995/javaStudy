package com.entor.oop;

/**
 * 公交站牌类的测试类
 * 
 * @author Administrator
 *
 */
public class BusStopBoardTest {
	public static void main(String[] args) {
		// 对象是引用类型的变量， 必须符合命名规范
		BusStopBoard lubanlu = new BusStopBoard();
		// 设置属性值
		lubanlu.setStation("鲁班路站");
		lubanlu.setSize(789.5);
		lubanlu.setColor("蓝白相间");
		lubanlu.setInformation("85路车从百花岭路到鲁班路；16路车从青秀区到西乡塘区");
		// 获取并输出对象的属性值
		System.out.println(lubanlu.getInformation());
		// 输出对象全部信息
		System.out.println(lubanlu);
		// 调用自定义方法
		lubanlu.provideBusStop();
		lubanlu.provideRest();
		BusStopBoard daxuelu = new BusStopBoard();
		// 设置属性值
		daxuelu.setStation("大学路站");
		daxuelu.setSize(789.5);
		daxuelu.setColor("蓝白相间");
		daxuelu.setInformation("85路车从百花岭路到鲁班路；16路车从青秀区到西乡塘区");
		// 获取并输出对象的属性值
		System.out.println(daxuelu.getInformation());
		// 输出对象全部信息
		System.out.println(daxuelu);
		// 调用自定义方法
		daxuelu.provideBusStop();
		daxuelu.provideRest();
	}
}
