package com.entor.collection;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {

	/**
	 * Teacher实例会按照工号降序排列
	 */
	@Override
	public int compare(Teacher o1, Teacher o2) {
		return o1.getEno() - o2.getEno();
	}

}
