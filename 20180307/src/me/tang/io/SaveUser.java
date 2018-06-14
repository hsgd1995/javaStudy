package me.tang.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Scanner;

/**
 * ��ʾ�û������˺ţ������ǰ���˺Ų������򴴽��� 
 * ��ʾ�����Ȼ�� ���˺źͽ��浽�ļ��У����˺Ŵ�����ѽ����ʾ������
 * 
 * @author Administrator
 *
 */
public class SaveUser {

	public static void main(String[] args) throws IOException {
		// �����û���
		System.out.println("�������˻���");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.next();
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String username = br.readLine();
		
		// ����user.properties�ļ�
		InputStream is = new FileInputStream("user.properties");
		Properties p = new Properties();
		p.load(is);
		// ��������û������ļ��е��û����Ƚ�
		if (p.getProperty(username) != null) {
			// ���ؽ��
			System.out.println("����˻����Ϊ��" + p.getProperty(username));
		} else {
			System.out.println("�������");
			double money = scanner.nextDouble();
			// ����µ��û����ͽ��
			p.setProperty(username, money + "");
			// д���ļ�
			p.store(new FileOutputStream("user.properties"), username);
			System.out.println("��ӳɹ���");
		}

	}

}
