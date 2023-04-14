package com.qf.day15;

public class Demo5 {
	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		String ab = "ab";
		String s1 = a + b; // 使用StringBuilder创建出来的结果，相当于new一个对象
		System.out.println(s1 == ab); // false
		String s2 = a + "b"; // 使用StringBuilder创建出来的结果，相当于new一个对象
		System.out.println(s2 == ab); // false
		// 两个常量，结果绝对不会发生其他的变化，就是ab，所以编译器会进行优化，直接将代码优化为String s3 = "ab";
		String s3 = "a" + "b"; 
		System.out.println(s3 == ab); // true
		// 两个常量，结果绝对不会发生其他的变化，就是ab，所以编译器会进行优化，直接将代码优化为String s4 = "ab";
		final String a1 = "a";
		String s4 = a1 + "b";
		System.out.println(s4 == ab); // true
		String s5 = a.concat(b); // 拼接字符串，结果是new的
		System.out.println(s5 == ab); // false
		String s6 = ab.concat(""); // 当拼接的内容为null或者长度为0时，直接返回原字符串
		System.out.println(s6 == ab); // true
		String s7 = s2.intern(); // 直接得到常量池中的地址，相当于String s7 = "ab";
		System.out.println(s7 == ab); // true
	}
}
