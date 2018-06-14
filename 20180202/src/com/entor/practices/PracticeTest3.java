package com.entor.practices;

import java.util.Scanner;

/**
 * 简单日历实现<br>
 * 
 * ①假设1日是周四，2日周五，3日周六，4日周天，5日周一，6日周二，7日周三，8日回到周四<br>
 * 7天是一周，假设1日周一，6日周六；此处应该有换行；每个周六都需要换行，13，20，27都需要换行；规律：假设n日是周一，(n + 1) % 7 ==
 * 0换行，如果n日是周m，(n + m ) % 7 == 0<br>
 * ②采用1900年1月1日（星期一）作为日历的起点<br>
 * 关于闰年：二月份多1天，29天<br>
 * 计算给定年份的给定月份的1日是周几?(1 + m ) % 7 == 0<br>
 * 1900年2月1日与起始时间间隔31日，31 % 7 = 3，所以2月1日是周（3 + 1）四； 1900年3月1日与其实时间间隔31日+28日（平年）
 * = 59 % 7 = 3，所以3月1日是周（3 + 1）四； 指定的年月1日与1900年1月1日的时间间隔？？？？
 * 
 * @author Administrator
 *
 */
public class PracticeTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		System.out.println("请输入月份：");
		int month = sc.nextInt();

		// 1900年1月1日到本月1日之间的天数
		int daysFrom1900ToNow = 0;

		// 1900年1月1日是星期一
		// 1900年份1月1日与指定年份上一年总天数
		int daysFrom1900ToPreYear = 0;
		for (int x = year - 1; x >= 1990; x--) {
			if (x % 400 == 0 || (x % 100 != 0 && x % 4 == 0)) {
				daysFrom1900ToPreYear += 366;
			} else {
				daysFrom1900ToPreYear += 365;
			}
		}

		daysFrom1900ToNow += daysFrom1900ToPreYear;

		// 判断闰年
		boolean isLeapYear = false;
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			isLeapYear = true;
		}

		// 当前年份到本月之前的天数
		int daysOfThisMonth = 0;
		for (int y = month; y >= 1; y--) {
			// 判断月份，其中只有二月份会受到闰年的影响
			int daysOfMonth = 0;
			switch (y) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				daysOfMonth = 31;
				break;
			case 2:
				if (isLeapYear) {
					daysOfMonth = 29;
				} else {
					daysOfMonth = 28;
				}
				break;
			default:
				daysOfMonth = 30;
				break;
			}
			// 如果是当前月份，只是记录以下当前月份的天数，并不参与到总天数的计算
			if (y == month) {
				daysOfThisMonth = daysOfMonth;
				continue;
			}
			daysFrom1900ToNow += daysOfMonth;
		}

		// 上述两段计算：假设当前是2018年10月，那么，总天数 = 1900年1月1日到2017年12月31日的天数 +
		// 2018年1月1日到2018年9月30日的天数

		// 1900年1月1日是星期一
		// 本月1号星期几
		int start = daysFrom1900ToNow % 7 + 1;
		System.out.println(year + "年" + month + "月1日星期：" + start);
		System.out.println(year + "年" + month + "月共：" + daysOfThisMonth + "天");

		// 输出日历
		System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		for (int i = 1; i <= start; i++) {
			System.out.print("\t");
		}
		for (int j = 1; j <= daysOfThisMonth; j++) {
			if ((j + start) % 7 == 1) {// 从1号开始，星期六输出后换行
				System.out.print("\n" + j + "\t");
			} else {
				System.out.print(j + "\t");
			}
		}
	}
}
