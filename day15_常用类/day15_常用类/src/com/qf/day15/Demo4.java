package com.qf.day15;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args) {
		String s = "hello, world! hello, world";
		// 根据下标获取字符
		char ch = s.charAt(0);
		System.out.println(ch);
		// 判定一个字符串是否包含另一个字符串
		boolean b = s.contains("llo");
		System.out.println(b);
		// 将字符串转换成字符数组
		char[] array = s.toCharArray();
		System.out.println(Arrays.toString(array));
		// 查找一个字符串在另一个字符串中首次出现的位置，得到相应的下标，如果不存在返回-1
		int index = s.indexOf("world");
		System.out.println(index);
		// 查找一个字符串在另一个字符串中出现的位置，从最后开始查找，得到相应的下标，如果不存在返回-1
		int index1 = s.lastIndexOf("world");
		System.out.println(index1);
		// 返回字符串的长度
		int length = s.length();
		System.out.println(length);
		// 去掉字符串前后的空格
		String s1 = "        hello, world    ";
		s1 = s1.trim(); // 字符串的值是不可变的，所有改变字符串的结果的方法一定有返回值，应该接收返回值
		System.out.println(s1);
		// 将小写字母转成大写
		s = s.toUpperCase();
		System.out.println(s);
		// 将大写字母转成小写
		s = s.toLowerCase();
		System.out.println(s);
		// 判定一个字符串是否以另一个字符串结尾
		boolean b1 = s.endsWith("rld");
		System.out.println(b1);
		// 判定一个字符串是否以另一个字符串开头
		boolean b2 = s.startsWith("rld");
		System.out.println(b2);
		// 将一个字符串中的包含的字符串全部替换成其他字符串
		s = s.replace("hello", "a");
		System.out.println(s);
		// 从指定位置开始截取部分字符串，截取后面所有的
		System.out.println(s.substring(4));
		// 从指定位置开始截取部分字符串，截取到另一个位置，从4到8
		System.out.println(s.substring(4, 8));
		// 将字符串根据指定的内容进行切割，成一个数组
		String[] strings = s.split("!");
		System.out.println(Arrays.toString(strings));
		// 将两个字符串进行拼接
		String s2 = "hello";
		String s3 = "world";
		s2 = s2.concat(s3);
		System.out.println(s2);
	}
}
