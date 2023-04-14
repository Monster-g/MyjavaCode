package com.qf.day17;

import java.util.ArrayList;

public class Demo03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("aaa");
		list.add(222);
		
		String str = (String) list.get(0);
		System.out.println(str);
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("bbb");
		// 编译时检查类型的限定
//		list1.add(222); // 报错，限定类型是String
		
		// 取值时帮助类型转换
		String string = list1.get(0);
		System.out.println(string);		
	}
}
