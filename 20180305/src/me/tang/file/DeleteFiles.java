package me.tang.file;

import java.io.File;

/**
 * File:递归删除文件夹及文件
 * 
 * @author Administrator
 *
 */
public class DeleteFiles {

	public void delFiles(File file) {
		//如果文件夹为空，则删除
		if (file.listFiles() == null) {
			file.delete();

		} else {
			System.out.println("删除：" + file.getAbsolutePath());
			File[] childFile = file.listFiles();
			//遍历文件夹
			for (int i = 0; i < childFile.length; i++) {
				File f = childFile[i];
				//递归
				delFiles(f);
			}
		}
		System.out.println("删除：" + file.getAbsolutePath());
		//删除父目录
		file.delete();
	}

	public static void main(String[] args) {
		DeleteFiles deleteFiles = new DeleteFiles();
		File file = new File("D:\\tsk\\testFile");
		deleteFiles.delFiles(file);
		System.out.println("执行删除完成！");
	}

}
