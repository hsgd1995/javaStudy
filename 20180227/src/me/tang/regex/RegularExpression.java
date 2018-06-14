package me.tang.regex;

/**
 * 正则表达式
 * 
 * @author Administrator
 *
 */
public class RegularExpression {

	public static void main(String[] args) {
		// 手机号码
		// 手机号码正则表达式
		String phoneRegex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0-1,5-9]))\\d{8}$";
		// 待验证手机号码
		String phone = "18111111111";
		System.out.println(phone.matches(phoneRegex));

		// 身份证号码
		// 身份证号码正则表达式
		String IDRegex1 = "^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$";
		String IDRegex2 = "^\\d{15}(\\d{2}[0-9xX])?$";
		// 待验证身份证号码
		String ID = "450603199511111111";
		System.out.println(ID.matches(IDRegex1));

		// 邮箱
		// 邮箱正则表达式
		String emailRegex1 = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
		String emailRegex2 = "^\\w{15}@\\w+\\.(com|com.cn){1}$";
		// 待验证邮箱
		String email = "abc123456@qq.com";
		System.out.println(email.matches(emailRegex2));

		// 用户名
		// 用户名正则表达式
		String userNameRegex = "^[a-zA-Z]\\w{8,10}$";
		// 待验证用户名
		String userName = "a123456789";
		System.out.println(userName.matches(userNameRegex));
	}

}
