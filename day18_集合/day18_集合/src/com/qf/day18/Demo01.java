package com.qf.day18;

import java.util.ArrayList;

public class Demo01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("hello");
		System.out.println(list);
		
		ArrayList<Student> list1 = new ArrayList<Student>();
		list1.add(new Student("����", "1", "��"));
		list1.add(new Student("����", "2", "��"));
		list1.add(new Student("����", "3", "��"));
		System.out.println(list1);
		
		boolean b = list1.contains(new Student("", "2", ""));
		System.out.println(b);
		
		int index = list1.indexOf(new Student("", "2", ""));
		System.out.println(list1.get(index));
	}
}
