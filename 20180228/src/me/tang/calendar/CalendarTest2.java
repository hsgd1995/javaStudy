package me.tang.calendar;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarTest2 {

	public static void main(String[] args) {
		TimeZone am = TimeZone.getTimeZone("GMT+04:00");
		Calendar cal1 = Calendar.getInstance(am);
		TimeZone paris = TimeZone.getTimeZone("GMT+01:00");
		Calendar cal2 = Calendar.getInstance(paris);
		System.out.println(cal1.getFirstDayOfWeek());
		System.out.println(cal2.getFirstDayOfWeek());
	}

}
