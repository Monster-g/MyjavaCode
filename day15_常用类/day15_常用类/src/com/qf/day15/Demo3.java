package com.qf.day15;

public class Demo3 {
	public static void main(String[] args) {
		// ������ʽ������
		String s1 = "hello";
		String s2 = new String("hello");
		
		String s3 = "hello";
		String s4 = new String("hello");
		
		System.out.println(s3==s4); // false
	}
}
