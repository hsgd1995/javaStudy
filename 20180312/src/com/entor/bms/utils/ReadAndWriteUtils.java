package com.entor.bms.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ReadAndWriteUtils {
    private static final String FILE_PATH = "user";

    /**
     * 追加一个用户
     *
     * @param userInfo
     */
    public static void singleWrite(String userInfo) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(FILE_PATH, true));
            bw.write(userInfo);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
