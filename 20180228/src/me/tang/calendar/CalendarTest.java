package me.tang.calendar;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 打印日历 ：输入年、月，打印出该月的日历图
 * 
 * @author Administrator
 *
 */
public class CalendarTest {

	public static void main(String[] args) {
		// 输入年月
		System.out.println("请输入年份：");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		System.out.println("输入的年，月为：" + year + " " + month);

		// 根据输入的年月设置Calendar
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);
		// 将日设置为1号，1号为第一天，便于在获取该日期是星期几时可以获取到该月的第一天是星期几
		c.set(Calendar.DAY_OF_MONTH, 1);

		// 获取该月第一天是星期几
		int firstDayOfWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
		System.out.println("该月第一天是星期：" + firstDayOfWeek);
		// 获取该月的天数
		int countDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("该月有" + countDayOfMonth + "天");
		// 打印日历星期头部
		System.out.println("星期日\t" + "星期一\t" + "星期二\t" + "星期三\t" + "星期四\t" + "星期五\t" + "星期六\t");
		
		// 打印日
		for (int j = 1; j <= countDayOfMonth; j++) {
			// 打印在日历上该月的1号的前面有多少个空位
			if(j==1){
				for(int k =0;k<firstDayOfWeek;k++){
					System.out.print("\t");
				}
			}
			System.out.print("  "+j+"\t");
			// 输出完星期六后应换行（即输出到属于星期天的日时应在每行的最左侧）
			if ((j + firstDayOfWeek) % 7 == 0 && (j + firstDayOfWeek)>=7) {
				System.out.println();
			} 
		}
	}

}
