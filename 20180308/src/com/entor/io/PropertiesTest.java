package com.entor.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        // Properties类：读写类似于jdbc.properties配置文件，获取配置列表
        // 读jdbc.properties
        BufferedReader br = new BufferedReader(new FileReader("jdbc.properties"));
        // 创建属性列表对象
        Properties properties = new Properties();
        // 加载属性列表
        properties.load(br);
        System.out.println("jdbc.username=" + properties.getProperty("jdbc.username"));
        System.out.println("jdbc.url=" + properties.getProperty("jdbc.url"));

        br.close();

        // 添加属性
        properties.setProperty("jdbc.initialSize", "10");
        properties.setProperty("jdbc.maxActive", "50");

        // 创建输出流，指定到jdbc2.properties文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("jdbc2.properties"));

        // 属性列表写到jdbc2.properties
        properties.store(bw, "保存新的属性列表");

        bw.close();
    }
}
