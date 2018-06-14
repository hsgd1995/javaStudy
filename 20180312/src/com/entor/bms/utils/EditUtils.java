package com.entor.bms.utils;

import com.entor.bms.entity.UserInfo;

import java.util.List;

public class EditUtils {
    public static String editUserInfo(UserInfo userInfo) {
        // 编号  姓名  证件号 租赁书籍    状态
        StringBuilder buffer = new StringBuilder();
        buffer.append(userInfo.getUid()).append("\t").append(userInfo.getName())
                .append("\t").append(userInfo.getIdCard()).append("\t")
                .append(handleRentBooks(userInfo.getRentBooks())).append("\t")
                .append(userInfo.getStatus()).append("\r\n");
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
