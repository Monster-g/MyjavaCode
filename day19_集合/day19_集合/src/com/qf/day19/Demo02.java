package com.qf.day19;

import java.util.TreeMap;

public class Demo02 {
	public static void main(String[] args) {
		TreeMap<Student, String> map = new TreeMap<>();
		map.put(new Student("����", "1", "��"), "b");
		map.put(new Student("����", "3", "��"), "d");
		map.put(new Student("����", "4", "��"), "a");
		map.put(new Student("����", "2", "��"), "c");
		System.out.println(map);
	}
}
