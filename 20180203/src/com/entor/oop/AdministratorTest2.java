package com.entor.oop;

import java.util.Scanner;

/**
 * ����Ա�������
 * 
 * @author Administrator
 *
 */
public class AdministratorTest2 {
	public static void main(String[] args) {
		// ����admin���󣬱�������ȷ���û���������
		Administrator admin = new Administrator();
		admin.setName("admin");
		admin.setPassword("111111");

		// �����û���������
		Scanner sc = new Scanner(System.in);

		// ��admin�������ƥ�� get����ȡ�������������������equals����ƥ��
		System.out.println("�������û�����");
		String username = sc.next();
		System.out.println("���������룺");
		String password = sc.next();

		if (admin.getName().equals(username) && admin.getPassword().equals(password)) {
			String newpass = null;// ����������
			while (true) {
				// ƥ��ɹ������Ȩ�ޣ�����������
				System.out.println("�����������룺");
				newpass = sc.next();
				// �����������룬�������벻һ�£��������룬ֱ������һ�£�����whileѭ����
				System.out.println("�ٴ����������룺");
				String repass = sc.next();

				if (newpass.equals(repass)) {
					break;
				}
				System.out.println("������������벻һ�£����������룡");
			}
			// �޸�admin�����е�����
			admin.setPassword(newpass);
			// �޸ĳɹ������admin����
			System.out.println("�޸ĳɹ�������Ա�������룺" + admin.getPassword());
		} else {
			// ƥ��ʧ�ܣ�û��Ȩ�ޣ��������
			System.out.println("Ȩ����֤ʧ�ܣ��˳�ϵͳ��");
		}
	}
}
