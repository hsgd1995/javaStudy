package com.entor.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * set���ϣ���ѧset���ϵĳ���<br>
 * HashSet��setʵ���࣬������֤ set �ĵ���˳���ر���������֤��˳���ò��䡣��������ʹ�� null Ԫ�ء�
 * 
 * @author Administrator
 *
 */
public class HashSetTest {
	public static void main(String[] args) {
		// ������
		HashSet set = new HashSet();
		set.add("bbb");
		set.add("aaa");
		set.add("ccc");
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("bbb"));
		System.out.println(set.isEmpty());
		System.out.println(set.remove("aaa"));
		for(Iterator it = set.iterator(); it.hasNext();){
			System.out.println(it.next());
		}
		set.clear();
	}
}
