package com.qf.day15;

public class Demo2 {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 5;
		System.out.println(n1 == n2);
		
		Integer in1 = new Integer(5);
		Integer in2 = new Integer(5);
		
		System.out.println(in1 == in2);
		
		Integer in3 = 5;
		Integer in4 = 5;
		
		System.out.println(in3 == in4);
		
		Integer in5 = Integer.valueOf(5);
		Integer in6 = Integer.valueOf(5);
		
		System.out.println(in5 == in6);
		
		Integer in7 = Integer.valueOf(200);
		Integer in8 = Integer.valueOf(200);
		
		System.out.println(in7 == in8);
		
		Integer in9 = 200;
		Integer in10 = 200;
		
		System.out.println(in9 == in10);
	}
}
