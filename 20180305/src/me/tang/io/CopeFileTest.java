package me.tang.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutStream:拷贝文件
 * 
 * @author Administrator
 *
 */
public class CopeFileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("src/com/entor/file/FileTest.java");// 源文件
		FileInputStream fis = new FileInputStream(file);

		File newFile = new File("src/com/entor/file/NewFileTest.java");// 新文件
		FileOutputStream fos = new FileOutputStream(newFile);
		StringBuffer sb = new StringBuffer();
		int temp;
		while ((temp = fis.read()) != -1) {
			// 将源文件存入StringBuffer
			sb.append((char) temp);
			System.out.print((char) temp);
		}
		fis.close();
		// 修改类名
		String replace = sb.toString().replace("FileTest", "NewFileTest");
		for (char c : replace.toCharArray()) {
			// 输出内容
			fos.write(c);
		}
		fos.flush();
		fos.close();
	}

}
