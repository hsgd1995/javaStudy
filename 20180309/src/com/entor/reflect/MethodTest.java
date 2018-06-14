package com.entor.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;

public class MethodTest {
    public static void main(String[] args) throws Exception {
        // Student的方法
        Class clazz = com.entor.reflect.Student.class;
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        //  根据属性调用Set方法
        Field birth = clazz.getDeclaredField("birth");
        String birthName = birth.getName();
        Type birthType = birth.getType();
        Method method = clazz.getMethod("set" + birthName.substring(0, 1)
                .toUpperCase() + birthName.substring(1), new Class[]{Class.forName(birthType.getTypeName())});
        Object obj = clazz.newInstance();
        method.invoke(obj, new Object[]{new SimpleDateFormat("yyyy-MM-dd").parse("1980-08-15")});

        System.out.println(((Student) obj).getBirth());
    }
}
