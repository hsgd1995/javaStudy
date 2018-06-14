package com.entor.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计算合同续约日期：当前时间签订合同，合同有效期是3年，请设计实现计算合同续约日期
 * 
 * @author Administrator
 *
 */
public class DateTest2 {
	/**
	 * 根据合同签订日期获取合同续约日期
	 * 
	 * @param signeDate
	 * @return
	 * @throws ParseException
	 */
	public static Date getRenewDate(Date signeDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		// 年份+3，月份不变，日期+1
		// 1.将日期转成yyyyMMdd
		String signeDate_str = sdf.format(signeDate);// 20180228
		// 2.获得年月日
		int year = Integer.parseInt(signeDate_str.substring(0, 4));
		int month = Integer.parseInt(signeDate_str.substring(4, 6));
		int date = Integer.parseInt(signeDate_str.substring(6));
		// 3.计算续约日
		year += 3;
		date += 1;
		String renewDate_str = "" + year + month(month) + date;
		return sdf.parse(renewDate_str);
	}

	private static String month(int month) {
		if (month < 10)
			return "0" + month;
		return String.valueOf(month);
	}

	public static void main(String[] args) throws ParseException {
		System.out.println(getRenewDate(new Date()));
	}
}
