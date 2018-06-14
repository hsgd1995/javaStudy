package com.entor.test;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 录入
        List<Student> list = StudentHandler.saveStudents();

        // 列出�?有学生信�?
        StudentHandler.list(list);

        // 查询分数�?80以上的学�?
        StudentHandler.listByScoreBeyond(list, 80);

        // 打印�?高分学生信息
        StudentHandler.listByMaxScore(list);

        // 打印平均�?
        StudentHandler.avg(list);
    }
}
