package me.tang.file;

import java.io.File;

/**
 * File:�ݹ�ɾ���ļ��м��ļ�
 * 
 * @author Administrator
 *
 */
public class DeleteFiles {

	public void delFiles(File file) {
		//����ļ���Ϊ�գ���ɾ��
		if (file.listFiles() == null) {
			file.delete();

		} else {
			System.out.println("ɾ����" + file.getAbsolutePath());
			File[] childFile = file.listFiles();
			//�����ļ���
			for (int i = 0; i < childFile.length; i++) {
				File f = childFile[i];
				//�ݹ�
				delFiles(f);
			}
		}
		System.out.println("ɾ����" + file.getAbsolutePath());
		//ɾ����Ŀ¼
		file.delete();
	}

	public static void main(String[] args) {
		DeleteFiles deleteFiles = new DeleteFiles();
		File file = new File("D:\\tsk\\testFile");
		deleteFiles.delFiles(file);
		System.out.println("ִ��ɾ����ɣ�");
	}

}
