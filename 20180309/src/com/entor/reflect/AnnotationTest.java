package com.entor.reflect;

import java.util.ArrayList;
import java.util.List;

public class AnnotationTest {
    @SuppressWarnings("rawtypes")
    @Deprecated
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        List list = new ArrayList();
    }

    // Spring容器在合适的时机，通过name或者type在反射机制的作用下为需要赋值的引用进行赋值
    // @Autowired自动装配bean（name，type）
    // @Resource根据指定引用名称自动装配bean
}