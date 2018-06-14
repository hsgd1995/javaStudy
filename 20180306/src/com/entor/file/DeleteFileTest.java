package com.entor.file;

import java.io.File;

public class DeleteFileTest {
	// ɾ��D:\test
	public static void delete(File file) {
		if (file.isFile()) {// �ļ�
			file.delete();
			System.out.println("ɾ����" + file.getAbsolutePath());
		} else {// Ŀ¼
			File[] files = file.listFiles();
			if (files.length != 0) {
				for (File file2 : files) {// ������Ŀ¼
					delete(file2);// �ݹ�
				}
			}
			file.delete();// ɾ����Ŀ¼
			System.out.println("ɾ����" + file.getAbsolutePath());
		}
	}

	public static void main(String[] args) {
		delete(new File("D:\\test"));
	}
}
