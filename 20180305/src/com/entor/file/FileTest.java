package com.entor.file;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * java使用File作为文件或者目录的抽象描述
 * 
 * @author Administrator
 *
 */
public class FileTest {
	public static void main(String[] args) throws URISyntaxException, IOException {
		// File构造器
		
		File a = new File("D:\\JSD201801");// 表示文件夹
		
		File file2 = new File("D:\\JSD201801\\班级 1\\2-5韦窦新A\\JDK_API_1_6_zh_CN.CHM");// 表示文件
		File file3 = new File("src/com/entor/test");// 表示文件夹
		File file4 = new File("src/com/entor/test/Test.java");// 表示文件
		
		System.out.println(a.exists() + "-" + file2.exists() + "-" + file3.exists() + "-" + file4.exists());
		
		System.out.println(a.isDirectory() + "-" + file2.isFile() + "-" + file3.isDirectory() + "-" + file4.isFile());

		// 获得目录下的子目录和文件的名称
		String[] dirs = a.list();
		for (String dir : dirs) {
			System.out.println(dir);
		}

		System.out.println(file4.length());

		// 获得目录下的子目录和文件的名称
		File[] files = a.listFiles();
		for (File f : files) {
			System.out.println(f.getName() + "是否为文件：" + f.isFile());
		}

		System.out.println(a.getParent());
		System.out.println(a.getParentFile().list());

		System.out.println(a.getPath());
		System.out.println(a.getAbsolutePath());
		System.out.println(file3.getPath());
		System.out.println(file3.getAbsolutePath());

		// 创建文件或目录
		File f = new File("D:\\JSD201801\\test.txt");
		// System.out.println(f.createNewFile());
		File f2 = new File("D:\\JSD201801\\test\\abc\\test");
		// System.out.println(f2.mkdirs());

		// 删除
		System.out.println(f.delete());
		System.out.println(f2.delete());
	}
}
