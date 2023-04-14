package com.qf.day18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Demo04 {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		// 添加(无序)
		set.add("hello");
		set.add("hello");
		set.add("world");
		set.add("java");
		System.out.println(set);
		
		// 删除
		set.remove("java");
		System.out.println(set);
		
		// 遍历
		for (String string : set) {
			System.out.println(string);
		}
		
//		List<Student> list = Arrays.asList(
//				new Student("张三", "1", "男"), 
//				new Student("李四", "2", "男"), 
//				new Student("王五", "3", "男"), 
//				new Student("张三", "1", "男"),
//				new Student("赵六", "4", "男")
//			);
//		// 去掉集合中的重复元素，是通过hashCode和equals去重
//		HashSet<Student> set1 = new HashSet<Student>(list);
//		System.out.println(set1);
	}
}
