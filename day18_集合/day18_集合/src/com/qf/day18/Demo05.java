package com.qf.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Demo05 {
	public static void main(String[] args) {
		List<Student> list2 = Arrays.asList(
					new Student("张三", "3", "男"), 
					new Student("李四", "4", "男"), 
					new Student("王五", "2", "男"), 
					new Student("赵六", "1", "男")
				);

		// 需要Student重写comparable接口，否则在运行时会出错
		// 根据比较来判定是否重复
		TreeSet<Student> set = new TreeSet<Student>(list2);
		System.out.println(set);
		
		
	}
}
