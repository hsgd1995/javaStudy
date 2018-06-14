package me.tang.regex;

/**
 * ������ʽ
 * 
 * @author Administrator
 *
 */
public class RegularExpression {

	public static void main(String[] args) {
		// �ֻ�����
		// �ֻ�����������ʽ
		String phoneRegex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0-1,5-9]))\\d{8}$";
		// ����֤�ֻ�����
		String phone = "18111111111";
		System.out.println(phone.matches(phoneRegex));

		// ���֤����
		// ���֤����������ʽ
		String IDRegex1 = "^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$";
		String IDRegex2 = "^\\d{15}(\\d{2}[0-9xX])?$";
		// ����֤���֤����
		String ID = "450603199511111111";
		System.out.println(ID.matches(IDRegex1));

		// ����
		// ����������ʽ
		String emailRegex1 = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
		String emailRegex2 = "^\\w{15}@\\w+\\.(com|com.cn){1}$";
		// ����֤����
		String email = "abc123456@qq.com";
		System.out.println(email.matches(emailRegex2));

		// �û���
		// �û���������ʽ
		String userNameRegex = "^[a-zA-Z]\\w{8,10}$";
		// ����֤�û���
		String userName = "a123456789";
		System.out.println(userName.matches(userNameRegex));
	}

}
