package me.tang.agreement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 合同续约类
 * 
 * @author Administrator
 *
 */
public class AgreementTest {

	public static void main(String[] args) throws ParseException {
		// Date
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String[] now_date = sdf.format(date).split("-");
		for (int i = 0; i < now_date.length; i++) {
			System.out.println(now_date[i]);

		}
		int now_year = Integer.parseInt(now_date[0]);
		int now_month = Integer.parseInt(now_date[1]);
		int now_day = Integer.parseInt(now_date[2]);

		String AgreementYear = (now_year + 3) + "";

		String agreementMonth = now_month < 10 ? "0" + now_month : now_month + "";
		String agreementDay = (now_day + 1) + "";

		String agreementDate = AgreementYear + "-" + agreementMonth + "-" + agreementDay;
		System.out.println(agreementDate);
		System.out.println(sdf.parse(agreementDate));
		// Calendar
		Calendar c = Calendar.getInstance();
		c.set(2016, 1, 29);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "  " + month + "   " + day);
		c.add(Calendar.YEAR, 3);
		c.add(Calendar.DAY_OF_MONTH, 1);
		int eyear = c.get(Calendar.YEAR);
		int emonth = c.get(Calendar.MONTH) + 1;
		int eday = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(eyear + "  " + emonth + "   " + eday);
		String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(c.getTime());
		System.out.println(str);
	}

}
