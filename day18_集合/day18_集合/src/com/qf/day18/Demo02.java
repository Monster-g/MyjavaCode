package com.qf.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo02 {
	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("d");
//		list.add("a");
//		list.add("b");
//		list.add("c");
		// 当所有的元素已知，且不能使用循环时，可以使用以下方法
		// 但是下面的方法得到的List不能执行大部分写操作，例如删除，添加等，支持大部分读操作
		List<String> list = Arrays.asList("d", "a", "b", "c");
		// 可以使用下面的办法创建ArrayList
//		list = new ArrayList<String>(list);
//		list.remove(1);
//		list.set(1, "f"); // 支持设置，因为不用扩容
		System.out.println(list);
		// 对集合进行排序
		Collections.sort(list);
		System.out.println(list);
		
		List<Student> list2 = Arrays.asList(
					new Student("张三", "3", "男"), 
					new Student("李四", "4", "男"), 
					new Student("王五", "2", "男"), 
					new Student("赵六", "1", "男")
				);
		// 排序需要对象实现Comparable接口
		Collections.sort(list2);
		System.out.println(list2);
		
		
	}
	
	
	
}
