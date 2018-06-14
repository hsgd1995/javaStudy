package com.entor.file;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * javaʹ��File��Ϊ�ļ�����Ŀ¼�ĳ�������
 * 
 * @author Administrator
 *
 */
public class NewFileTest {
	public static void main(String[] args) throws URISyntaxException, IOException {
		// File������
		File file = new File("D:\\JSD201801");// ��ʾ�ļ���
		File file2 = new File("D:\\JSD201801\\�༶ 1\\2-5Τ���A\\JDK_API_1_6_zh_CN.CHM");// ��ʾ�ļ�
		File file3 = new File("src/com/entor/test");// ��ʾ�ļ���
		File file4 = new File("src/com/entor/test/Test.java");// ��ʾ�ļ�
		System.out.println(file.exists() + "-" + file2.exists() + "-" + file3.exists() + "-" + file4.exists());
		System.out
				.println(file.isDirectory() + "-" + file2.isFile() + "-" + file3.isDirectory() + "-" + file4.isFile());

		// ���Ŀ¼�µ���Ŀ¼���ļ�������
		String[] dirs = file.list();
		for (String dir : dirs) {
			System.out.println(dir);
		}

		System.out.println(file4.length());

		// ���Ŀ¼�µ���Ŀ¼���ļ�������
		File[] files = file.listFiles();
		for (File f : files) {
			System.out.println(f.getName() + "�Ƿ�Ϊ�ļ���" + f.isFile());
		}

		System.out.println(file.getParent());
		System.out.println(file.getParentFile().list());

		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file3.getPath());
		System.out.println(file3.getAbsolutePath());

		// �����ļ���Ŀ¼
		File f = new File("D:\\JSD201801\\test.txt");
		// System.out.println(f.createNewFile());
		File f2 = new File("D:\\JSD201801\\test\\abc\\test");
		// System.out.println(f2.mkdirs());

		// ɾ��
		System.out.println(f.delete());
		System.out.println(f2.delete());
	}
}