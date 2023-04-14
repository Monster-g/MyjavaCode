package com.qf.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo03 {
	public static void main(String[] args) {
		List<Student> list2 = Arrays.asList(
					new Student("张三", "3", "男"), 
					new Student("李四", "4", "男"), 
					new Student("王五", "2", "男"), 
					new Student("赵六", "1", "男")
				);

		// 随机打乱顺序
		Collections.shuffle(list2);
		System.out.println(list2);
	}
}
