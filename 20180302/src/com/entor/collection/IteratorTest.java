package com.entor.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ������
 * 
 * @author Administrator
 *
 */
public class IteratorTest {
	public static void main(String[] args) {
		// ����list
		ArrayList list = new ArrayList();
		list.add("123");
		list.add("321");
		list.add("222");
		for(int index = 0; index<list.size();index++){
			System.out.println(list.get(index));
		}
		Iterator it = list.iterator();
		while(it.hasNext()){// ��������Ԫ�ص�����
			System.out.println(it.next());// ȡ�ü���Ԫ��
		}
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
