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
		// ����ʱ������͵��޶�
//		list1.add(222); // �����޶�������String
		
		// ȡֵʱ��������ת��
		String string = list1.get(0);
		System.out.println(string);		
	}
}
