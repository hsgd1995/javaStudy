package com.entor.collection;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {

	/**
	 * Teacherʵ���ᰴ�չ��Ž�������
	 */
	@Override
	public int compare(Teacher o1, Teacher o2) {
		return o1.getEno() - o2.getEno();
	}

}
