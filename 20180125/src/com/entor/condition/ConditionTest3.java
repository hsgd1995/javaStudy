package com.entor.condition;

public class ConditionTest3 {

	public static void main(String[] args) {
		double score = -80;
		if (score >= 0 && score < 60) {
			System.out.println("不及格！");
		} else if (score >= 60 && score < 80) {
			System.out.println("及格！");
		} else if (score >= 80 && score < 90) {
			System.out.println("良好！");
		} else if (score >= 90 && score <= 100) {
			System.out.println("优秀！");
		}else{
			System.out.println("成绩不合理！");
		}
	}
}
