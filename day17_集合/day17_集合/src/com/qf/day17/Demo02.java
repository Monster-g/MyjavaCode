package com.qf.day17;

import java.util.LinkedList;

public class Demo02 {
	public static void main(String[] args) {
		// LinkedList特有的用法
		LinkedList list = new LinkedList();
		// 添加元素
		list.add("aaa"); // 相当于addLast
		// 添加到最后
		list.addLast("bbb");
		// 添加到开头
		list.addFirst("ccc");
		System.out.println(list);
		
		// 得到最前面的元素
		Object element = list.element();
		System.out.println(element);
		// 得到最前面的元素
		Object first = list.getFirst();
		System.out.println(first);
		// 得到最后面的元素
		Object last = list.getLast();
		System.out.println(last);
		// 弹出第一个元素（得到第一个元素，并将其在集合删除）
		Object pop = list.pop();
		System.out.println(pop);
		System.out.println(list);
		// 向头部添加元素
		list.push("ccc");
		System.out.println(list);
	}
}
