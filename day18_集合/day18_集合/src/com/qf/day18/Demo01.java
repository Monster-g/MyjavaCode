package com.qf.day18;

import java.util.ArrayList;

public class Demo01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("hello");
		System.out.println(list);
		
		ArrayList<Student> list1 = new ArrayList<Student>();
		list1.add(new Student("张三", "1", "男"));
		list1.add(new Student("李四", "2", "男"));
		list1.add(new Student("王五", "3", "男"));
		System.out.println(list1);
		
		boolean b = list1.contains(new Student("", "2", ""));
		System.out.println(b);
		
		int index = list1.indexOf(new Student("", "2", ""));
		System.out.println(list1.get(index));
	}
}
