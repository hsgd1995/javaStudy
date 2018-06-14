package com.entor.collection;

import java.util.TreeMap;

/**
 * 基于红黑树实现的映射<br>
 * 根据key的自然顺序排序（key实现了Comparable接口），或者在实例化的时候根据构造器，传入指定的比较器，实现排序
 * 
 * @author Administrator
 *
 */
public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(8, "扶绥");
		map.put(2, "西乡塘");
		map.put(3, "江南");
		map.put(7, "兴宁");
		map.put(1, "青秀");
		System.out.println(map);

		TreeMap<String, String> map2 = new TreeMap<>();
		map2.put("8", "扶绥");
		map2.put("2", "西乡塘");
		map2.put("3", "江南");
		map2.put("7", "兴宁");
		map2.put("1", "青秀");
		System.out.println(map2);

		TreeMap<Student, Double> map3 = new TreeMap<>();
		map3.put(new Student(8, "张三"), 425D);
		map3.put(new Student(2, "李四"), 600D);
		map3.put(new Student(3, "李四"), 580D);
		map3.put(new Student(7, "李四"), 500D);
		map3.put(new Student(1, "李四"), 625D);
		System.out.println(map3);

		TreeMap<Teacher, Double> map4 = new TreeMap<>(new TeacherComparator());
		map4.put(new Teacher(8, "张三"), 425D);
		map4.put(new Teacher(2, "李四"), 600D);
		map4.put(new Teacher(3, "李四"), 580D);
		map4.put(new Teacher(7, "李四"), 500D);
		map4.put(new Teacher(1, "李四"), 625D);
		System.out.println(map4);
	}
}
