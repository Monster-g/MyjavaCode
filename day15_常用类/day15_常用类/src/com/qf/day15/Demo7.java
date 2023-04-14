package com.qf.day15;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo7 {
	public static void main(String[] args) {
		// 加法
		BigDecimal b3 = new BigDecimal("3435");
		BigDecimal b4 = new BigDecimal("656757");
		System.out.println(b3.add(b4));
		
		// 减法
		BigDecimal b1 = new BigDecimal("1.0");
		BigDecimal b2 = new BigDecimal("0.9");
		System.out.println(b1.subtract(b2));
		
		// 乘法
		BigDecimal b5 = new BigDecimal("3456567457567856756756");
		BigDecimal b6 = new BigDecimal("4353453453453453453453");
		System.out.println(b5.multiply(b6));
		
		// 除法
		BigDecimal b7 = new BigDecimal("5");
		BigDecimal b8 = new BigDecimal("2");
		// 除法如果可以除尽，那么可以只用一个参数
		System.out.println(b7.divide(b8));
		
		BigDecimal b9 = new BigDecimal("5");
		BigDecimal b10 = new BigDecimal("3");
		// 除法如果不能除尽，那么需要指定保留的小数位，以及保留小数的方式，例如：四舍五入
		System.out.println(b9.divide(b10, 5000, RoundingMode.HALF_UP));
	}
}
