package me.tang.bms.utils;

import java.util.List;

import me.tang.bms.entity.User;

public class EditUtils {
	public static String editUserInfo(User User) {
		// ±àºÅ ÐÕÃû Ö¤¼þºÅ ×âÁÞÊé¼® ×´Ì¬
		StringBuilder buffer = new StringBuilder();
		buffer.append(User.getUid()).append("\t").append(User.getName()).append("\t").append(User.getIdCard())
				.append("\t").append(handleRentBooks(User.getRentBooks())).append("\t").append(User.getStatus())
				.append("\r\n");
		return buffer.toString();
	}

	private static String handleRentBooks(List<Integer> rentBooks) {
		StringBuilder buffer = new StringBuilder();
		for (int index = 0; index < rentBooks.size(); index++) {
			if (index == rentBooks.size() - 1) {
				buffer.append(rentBooks.get(index));
			} else {
				buffer.append(rentBooks.get(index)).append(",");
			}
		}
		return buffer.toString();
	}
}
