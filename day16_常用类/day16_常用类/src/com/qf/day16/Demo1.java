package com.qf.day16;

import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {
		// �õ���ǰʱ��
		Date now = new Date();
		System.out.println(now);
		// �õ�ʱ��ĺ�����������1970-1-1 00:00:00.000 GMT
		long time = now.getTime();
		System.out.println(time);
		
		// ��һ��ʱ�������ת��Date��Ķ���
		long n = 1647828409608L;
		Date d = new Date(n);
		System.out.println(d);
		
		// �󲿷ַ����Ѿ����������Ƽ�ʹ��Calendar��
//		Date d1 = new Date("2022-03-15");
		
		
	}

}
