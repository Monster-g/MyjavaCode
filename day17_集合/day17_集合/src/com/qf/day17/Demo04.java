package com.qf.day17;

public class Demo04 {
	public static void main(String[] args) {
		Student<String> stu = new Student<String>();
		stu.setName("ÕÅÈı");
		String name = stu.getName();
		System.out.println(name);
		
		Student<Integer> stu1 = new Student<Integer>();
		stu1.setName(22);
		Integer name2 = stu1.getName();
		System.out.println(name2);
	}
}
