package com.entor.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentHandler {
    /**
     * 录入学生信息并保�?
     */
    public static List<Student> saveStudents() {
        // 创建List，保存学�?
        List<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (count <= 5) {
            System.out.println("请输入第" + count + "个学生的信息�?");
            System.out.println("请输入id�?");
            int id = sc.nextInt();
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请输入学分：");
            double score = sc.nextDouble();

            // 封装数据到学生对�?
            Student s = new Student(id, name, score);

            // 将学生添加到集合�?
            list.add(s);
            count++;
        }
        return list;
    }

    /**
     * 列出�?有的学生信息
     *
     * @param list
     */
    public static void list(List<Student> list) {
        System.out.println("+++++++�?有学生信�?+++++++");
        for (Student s : list
                ) {
            if (s != null)
                System.out.println(s);
        }
    }

    /**
     * 列出分数在score以上的学生信�?
     *
     * @param score
     */
    public static void listByScoreBeyond(List<Student> list, double score) {
        System.out.println("+++++++大于80分学生信�?+++++++");
        for (Student s : list
                ) {
            if (s != null && s.getScore() > score)
                System.out.println(s);
        }
    }

    /**
     * 打印�?高分学生信息
     *
     * @param list
     */
    public static void listByMaxScore(List<Student> list) {
        double max = 0;
        Student student = null;
        for (Student s : list
                ) {
            if (s != null && s.getScore() > max) {
                max = s.getScore();
                student = s;
            }
        }
        System.out.println("+++++++�?高分学生信息+++++++");
        System.out.println(student);
    }

    /**
     * 打印平均�?
     *
     * @param list
     */
    public static void avg(List<Student> list) {
        double sum = 0;
        double count = 0;
        for (Student s : list
                ) {
            if (s != null) {
                sum += s.getScore();
                count++;
            }
        }
        System.out.println("+++++++平均�?+++++++");
        System.out.println(sum / count);
    }
}