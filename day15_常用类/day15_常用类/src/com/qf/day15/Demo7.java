package com.qf.day15;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo7 {
	public static void main(String[] args) {
		// �ӷ�
		BigDecimal b3 = new BigDecimal("3435");
		BigDecimal b4 = new BigDecimal("656757");
		System.out.println(b3.add(b4));
		
		// ����
		BigDecimal b1 = new BigDecimal("1.0");
		BigDecimal b2 = new BigDecimal("0.9");
		System.out.println(b1.subtract(b2));
		
		// �˷�
		BigDecimal b5 = new BigDecimal("3456567457567856756756");
		BigDecimal b6 = new BigDecimal("4353453453453453453453");
		System.out.println(b5.multiply(b6));
		
		// ����
		BigDecimal b7 = new BigDecimal("5");
		BigDecimal b8 = new BigDecimal("2");
		// ����������Գ�������ô����ֻ��һ������
		System.out.println(b7.divide(b8));
		
		BigDecimal b9 = new BigDecimal("5");
		BigDecimal b10 = new BigDecimal("3");
		// ����������ܳ�������ô��Ҫָ��������С��λ���Լ�����С���ķ�ʽ�����磺��������
		System.out.println(b9.divide(b10, 5000, RoundingMode.HALF_UP));
	}
}
