package com.entor.condition;

public class ConditionTest4 {

	public static void main(String[] args) {
		int month = 10;
		if(month>=3 && month<=5){
			System.out.println("春季");
		}else if(month>=6 && month<=8){
			System.out.println("夏季");
		}else if(month >=9 && month <=11){
			System.out.println("秋季");
		}else if(month ==12 || month>=1 && month <=2){
			System.out.println("冬季");
		}else{
			System.out.println("月份不合理");
		}
	}
}
