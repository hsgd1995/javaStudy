package me.tang.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutStream:�����ļ�
 * 
 * @author Administrator
 *
 */
public class CopeFileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("src/com/entor/file/FileTest.java");// Դ�ļ�
		FileInputStream fis = new FileInputStream(file);

		File newFile = new File("src/com/entor/file/NewFileTest.java");// ���ļ�
		FileOutputStream fos = new FileOutputStream(newFile);
		StringBuffer sb = new StringBuffer();
		int temp;
		while ((temp = fis.read()) != -1) {
			// ��Դ�ļ�����StringBuffer
			sb.append((char) temp);
			System.out.print((char) temp);
		}
		fis.close();
		// �޸�����
		String replace = sb.toString().replace("FileTest", "NewFileTest");
		for (char c : replace.toCharArray()) {
			// �������
			fos.write(c);
		}
		fos.flush();
		fos.close();
	}

}
