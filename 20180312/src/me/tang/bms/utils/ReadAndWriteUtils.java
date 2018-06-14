package me.tang.bms.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWriteUtils {
	private static final String FILE_PATH = "user";

	/**
	 * 追加一个用户
	 *
	 * @param user
	 */
	public static void singleWrite(String user) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(FILE_PATH, true));
			bw.write(user);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String read(){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(FILE_PATH));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
