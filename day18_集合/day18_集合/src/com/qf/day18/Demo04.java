package com.qf.day18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Demo04 {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		// ���(����)
		set.add("hello");
		set.add("hello");
		set.add("world");
		set.add("java");
		System.out.println(set);
		
		// ɾ��
		set.remove("java");
		System.out.println(set);
		
		// ����
		for (String string : set) {
			System.out.println(string);
		}
		
//		List<Student> list = Arrays.asList(
//				new Student("����", "1", "��"), 
//				new Student("����", "2", "��"), 
//				new Student("����", "3", "��"), 
//				new Student("����", "1", "��"),
//				new Student("����", "4", "��")
//			);
//		// ȥ�������е��ظ�Ԫ�أ���ͨ��hashCode��equalsȥ��
//		HashSet<Student> set1 = new HashSet<Student>(list);
//		System.out.println(set1);
	}
}
