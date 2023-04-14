package com.qf.day16;

import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {
		// 得到当前时间
		Date now = new Date();
		System.out.println(now);
		// 得到时间的毫秒数，距离1970-1-1 00:00:00.000 GMT
		long time = now.getTime();
		System.out.println(time);
		
		// 将一个时间毫秒数转成Date类的对象
		long n = 1647828409608L;
		Date d = new Date(n);
		System.out.println(d);
		
		// 大部分方法已经被废弃，推荐使用Calendar类
//		Date d1 = new Date("2022-03-15");
		
		
	}

}
