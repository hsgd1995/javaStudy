package me.tang.bufferstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ��ʾ�û������˺ţ������ǰ���˺Ų������򴴽��� ��ʾ�����Ȼ�� ���˺źͽ��浽�ļ��У����˺Ŵ�����ѽ����ʾ������
 * 
 * @author Administrator
 *
 */
public class Account {

	public static void main(String[] args) throws Exception {
		// �ͻ������˺�
		System.out.println("�������˺ţ�");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine().trim();
		// �����ļ��ַ�������
		Reader reader = new FileReader("D:\\tsk\\testFile\\test2-1.txt");
		// �����ļ�����������
		BufferedReader br = new BufferedReader(reader);
		// �����ļ��������û���Ϣ
		List<String> list = new ArrayList<>();
		// ���û����Ƿ����
		boolean flag = false;
		String str;
		while ((str = br.readLine()) != null) {
			list.add(str);
			// �и�ÿһ���ַ������ļ���ʽΪ��username money
			String account[] = str.split(" ");
			String name = account[0];// ��ȡ�˻�
			if (name.equals(username)) {
				// ��ӡ�ͻ����
				System.out.println("���Ľ��Ϊ��" + account[1]);
				flag = true;
			}
		}
		br.close();
		if (!flag) {
			// ����ͻ�������˻������ļ��У������ǰ���˺Ų������򴴽���
			// ��ʾ�����Ȼ�� ���˺źͽ��浽�ļ���
			System.out.println("�����");
			double money = scanner.nextDouble();
			// �����ļ��ַ������
			Writer writer = new FileWriter("D:\\tsk\\testFile\\test2-1.txt");
			// Writer writer = new FileWriter("D:\\tsk\\testFile\\test2-1.txt",true);
			// �����ļ����������
			BufferedWriter bw = new BufferedWriter(writer);
			// ��ӿͻ��������Ϣ
			list.add(username + " " + money);
			for (int i = 0; i < list.size(); i++) {
				// д�ļ�
				bw.write(list.get(i) + "\n");
			}
			bw.flush();
			bw.close();
		}
	}

}
