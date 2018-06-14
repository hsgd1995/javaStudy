package com.entor.innerclass;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 内部类：在集合框架中，发现底层实现运用了大量的内部类，这只是其中一种场合，更多的场合，使用的是匿名内部类
 */
public class InnerClass {
    // 静态成员
    static class StaticInnerClass {
        Object obj;

        public StaticInnerClass(Object obj) {
            this.obj = obj;
        }
    }

    // 成员
    class MemberInnerClass {
        Object obj;

        public MemberInnerClass(Object obj) {
            this.obj = obj;
        }
    }

    // 局部
    public void print() {
        class LocalInnerClass {
            Object obj;

            public LocalInnerClass(Object obj) {
                this.obj = obj;
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass("456");
        System.out.println(localInnerClass.obj);
    }

    public void printStaticInnerClass(StaticInnerClass staticInnerClass) {
        System.out.println(staticInnerClass.obj);
    }

    public void printMemberInnerClass(MemberInnerClass memberInnerClass) {
        System.out.println(memberInnerClass.obj);
    }
}
