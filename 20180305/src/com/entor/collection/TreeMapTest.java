package com.entor.collection;

import java.util.TreeMap;

/**
 * ���ں����ʵ�ֵ�ӳ��<br>
 * ����key����Ȼ˳������keyʵ����Comparable�ӿڣ���������ʵ������ʱ����ݹ�����������ָ���ıȽ�����ʵ������
 * 
 * @author Administrator
 *
 */
public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(8, "����");
		map.put(2, "������");
		map.put(3, "����");
		map.put(7, "����");
		map.put(1, "����");
		System.out.println(map);

		TreeMap<String, String> map2 = new TreeMap<>();
		map2.put("8", "����");
		map2.put("2", "������");
		map2.put("3", "����");
		map2.put("7", "����");
		map2.put("1", "����");
		System.out.println(map2);

		TreeMap<Student, Double> map3 = new TreeMap<>();
		map3.put(new Student(8, "����"), 425D);
		map3.put(new Student(2, "����"), 600D);
		map3.put(new Student(3, "����"), 580D);
		map3.put(new Student(7, "����"), 500D);
		map3.put(new Student(1, "����"), 625D);
		System.out.println(map3);

		TreeMap<Teacher, Double> map4 = new TreeMap<>(new TeacherComparator());
		map4.put(new Teacher(8, "����"), 425D);
		map4.put(new Teacher(2, "����"), 600D);
		map4.put(new Teacher(3, "����"), 580D);
		map4.put(new Teacher(7, "����"), 500D);
		map4.put(new Teacher(1, "����"), 625D);
		System.out.println(map4);
	}
}
