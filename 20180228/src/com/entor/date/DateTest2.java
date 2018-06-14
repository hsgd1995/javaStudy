package com.entor.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �����ͬ��Լ���ڣ���ǰʱ��ǩ����ͬ����ͬ��Ч����3�꣬�����ʵ�ּ����ͬ��Լ����
 * 
 * @author Administrator
 *
 */
public class DateTest2 {
	/**
	 * ���ݺ�ͬǩ�����ڻ�ȡ��ͬ��Լ����
	 * 
	 * @param signeDate
	 * @return
	 * @throws ParseException
	 */
	public static Date getRenewDate(Date signeDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		// ���+3���·ݲ��䣬����+1
		// 1.������ת��yyyyMMdd
		String signeDate_str = sdf.format(signeDate);// 20180228
		// 2.���������
		int year = Integer.parseInt(signeDate_str.substring(0, 4));
		int month = Integer.parseInt(signeDate_str.substring(4, 6));
		int date = Integer.parseInt(signeDate_str.substring(6));
		// 3.������Լ��
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
