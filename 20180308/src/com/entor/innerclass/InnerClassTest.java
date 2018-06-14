package com.entor.innerclass;

import java.util.LinkedList;

/**
 * 通过匿名内部类的方式，突破了接口和抽象类的实例化障碍<br>
 *     所有的类和接口都可以通过匿名内部类的形式实例化<br>
 *         因为匿名内部类是以子类或者实现类的身份出现的。
 */
public class InnerClassTest {
    public static void main(String[] args) {
        // 如果要直接创建静态内部类对象，使用静态访问方式
        InnerClass.StaticInnerClass staticInnerClass = new InnerClass.StaticInnerClass(new String("123"));
        InnerClass outter = new InnerClass();
        outter.printStaticInnerClass(staticInnerClass);

        // 如果要直接创建成员内部类
        InnerClass.MemberInnerClass memberInnerClass = outter.new MemberInnerClass("123");
        outter.printMemberInnerClass(memberInnerClass);

        // 使用局部内部类
        outter.print();

        // 匿名内部类
        // 首先生成一个匿名类，实现了Runnable接口
        // 通过匿名类创建对象，将对象赋值给Runnable接口类型的引用
        // 体现了多态的特征
        /*Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    try {
                        Thread.sleep(666);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();*/

        // 首先创建一个匿名内部类，继承Thread
        // 通过匿名类创建对象，将对象赋值给Thread类型的引用
        // 体现了多态的特征
        Thread t3 = new Thread() {
            @Override
            public void run() {
                for (int j = 1; j <= 20; j++) {
                    try {
                        Thread.sleep(555);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(j);
                }
            }
        };
        t3.start();
    }
}
