package com.entor.oop;

/**
 * ����Ա�������
 * 
 * @author Administrator
 *
 */
public class AdministratorTest {
	public static void main(String[] args) {
		Administrator admin1 = new Administrator();
		admin1.setName("admin1");
		admin1.setPassword("111111");
		Administrator admin2 = new Administrator();
		admin2.setName("admin2");
		admin2.setPassword("222222");
		
		// �������
		System.out.println(admin1);
		System.out.println(admin2);
	}
}
