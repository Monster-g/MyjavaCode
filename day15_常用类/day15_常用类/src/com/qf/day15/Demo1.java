package com.qf.day15;

public class Demo1 {
	// 基本数据类型对应包装类
	public static void main(String[] args) {
		int n = 5;
		// 将基本数据类型转换成包装类
		Integer in = new Integer(n);// 1、使用new
		Integer in1 = n; // 2、直接赋值，jdk1.5的新特性，自动装箱
		Integer in2 = Integer.valueOf(n); // 3、使用valueOf
		
		double d = 2.0;
		Double d1 = new Double(d);// 1、使用new
		Double d2 = d; // 2、直接赋值，jdk1.5的新特性，自动装箱
		Double d3 = Double.valueOf(d); // 3、使用valueOf
		
		// 将包装类转换成基本数据类型
		int n1 = in; // 直接赋值，jdk1.5的新特性，自动拆箱
		int n2 = in.intValue(); // 使用intValue
		
		// 基本数据类型的默认值是前面数组中使用过的默认值，例如：int默认值为0
		// 但是包装类由于都是Object类的子类，所以默认值为null
		Integer in3 = null;
		// 包装类和基本数据类型在大多数时候都可以互换使用
		Integer in4 = 1;
		int n3 = new Integer(3);
		
		// 将字符串转换成数字
		int n4 = Integer.parseInt("23");
		double d4 = Double.parseDouble("25.5");
		// 转换失败会出现异常java.lang.NumberFormatException
		int n5 = Integer.parseInt("23a");
	}
}
