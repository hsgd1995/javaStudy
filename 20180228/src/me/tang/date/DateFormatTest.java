package me.tang.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/**
 * Date 测试类
 * @author Administrator
 *
 */
public class DateFormatTest {

	public static void main(String[] args) throws ParseException {
		//将当前时间转换成给定格式
		//获取当前时间
		Date now = new Date();
		String pattern = "yyyy-MM-dd HH:mm:ss";
		String pattern1 = "yyyy.MM.dd G 'at' HH:mm:ss z";
		String pattern2 = "EEE, MMM d, ''yy";
		String pattern3 = "h:mm a";
		String pattern4 = "hh 'o''clock' a, zzzz";
		String pattern5 = "K:mm a, z";
		String pattern6 = "yyyyy.MMMMM.dd GGG hh:mm aaa";
		String pattern7 = "EEE, d MMM yyyy HH:mm:ss Z";
		String pattern8 = "yyMMddHHmmssZ";
		String pattern9 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
		String pattern10 = "yyyy-MM-dd";
		String pattern11 = "yyyy/MM/DD";
		String pattern12 = "MM/dd/yyyy";
		//格式转换
		SimpleDateFormat sdf = new SimpleDateFormat(pattern4,new Locale("zh-cn"));
		System.out.println(sdf.format(now));
		
		//将给定时间转换成日期对象
		String date = "2018-02-02 12:12:12 123";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println(sdf2.parse(date));
	}

}
