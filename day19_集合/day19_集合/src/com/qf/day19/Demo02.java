package com.qf.day19;

import java.util.TreeMap;

public class Demo02 {
	public static void main(String[] args) {
		TreeMap<Student, String> map = new TreeMap<>();
		map.put(new Student("张三", "1", "男"), "b");
		map.put(new Student("李四", "3", "男"), "d");
		map.put(new Student("赵六", "4", "男"), "a");
		map.put(new Student("王五", "2", "男"), "c");
		System.out.println(map);
	}
}
