package com.entor.condition;

public class ConditionTest5 {

	public static void main(String[] args) {
		// 3-5月春季，6-8月夏季，9-11月秋季，12-2月冬季
		// 当前1月份，请设计程序，输出季节
		int month = 9;
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
		default:
			System.out.println("月份必须在1-12之间！");
			break;
		}
	}

}
