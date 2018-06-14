package com.entor.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ��ʾ�û������˺ţ������ǰ���˺Ų������򴴽�����ʾ�����<br>
 * Ȼ����˺źͽ��浽�ļ��У� ���˺Ŵ�����ѽ����ʾ������
 * 
 * @author Administrator
 *
 */
public class SaveUserTest {
	// �����ļ��е�����
	private static Map<String, String> users = new HashMap<>();
	private static int flag = 0;

	// һ���Զ��ļ�������Ϣ���浽�����У����顢���ϵȣ�
	public static void readUser(String path) {
		System.out.println("���ļ�...");
		// 1.����������
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(path));
			// 2.���ļ��� ������Ϣ��װ��map��
			String line;
			while ((line = br.readLine()) != null) {
				String[] strs = line.split(" ");
				users.put(strs[0], strs[1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 3.�ر�������
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// ����������ڱ���ļ����в��ң����ҵ�����ʾ
	// ���Ҳ����������Ϣ��׷�ӵ�������
	public static void editUser() {
		System.out.println("���ڴ���...");
		// 1.����
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ʺţ�");
		String username = sc.next();
		// 2.�ж�
		for (String key : users.keySet()) {
			if (username.equals(key)) {
				System.out.println("�ʺţ�" + key + "����" + users.get(key));
				flag = 1;
				return;
			}
		}
		// 3.���������ӵ�map��
		System.out.println("�������");
		String money = sc.next();
		users.put(username, money);
	}

	// һ����д�ļ����������е���Ϣд���ļ���
	public static void writeUser(String path) {
		System.out.println("д�ļ�...");
		// 1.���������
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(path));
			for (String key : users.keySet()) {
				String line = key + " " + users.get(key);
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		String path = "D:\\JSD1801\\wubin\\javase�γ�\\day15\\user.txt";
		// 1.���ļ���Ϣ���뵽map��
		readUser(path);
		// 2.�����û�������Ϣ�������Ƿ����
		editUser();
		if (flag == 1)// ���ҵ��û�������Ҫд�����
			return;
		// 3.��ȫ�µļ�����Ϣд���ļ�
		writeUser(path);
	}
}
