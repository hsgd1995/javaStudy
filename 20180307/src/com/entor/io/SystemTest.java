package com.entor.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * System �����һЩ���õ����ֶκͷ�����
 * 
 * @author Administrator
 *
 */
public class SystemTest {
	public static void main(String[] args) throws IOException {
		// System.in��ʾһ���ֽ�����ͨ�����Ǽ��̵�������
		InputStream is = System.in;
		// ��������������װ��Scanner�У��ṩ����Խ�Ķ�ȡ����
		Scanner sc = new Scanner(is);
		System.out.println("������:");
		// System.out.println(sc.next());// ���ո���Ϊɨ��Ľ������
		// System.out.println(sc.nextLine());// ���س�������Ϊɨ��Ľ������

		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		System.out.println(br.readLine());// ���س�������Ϊɨ��Ľ������
	}
}
