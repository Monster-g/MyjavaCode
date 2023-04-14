package com.qf.day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		// ����һ�����ڵĸ�ʽ
		// yyyy�꣬yy��λ�����꣬MM�£�dd�գ�HH24Сʱ�ƣ�hh12Сʱ�ƣ�mm�֣�ss�룬SSS���룬a������(AM\PM)
		SimpleDateFormat sdf = new SimpleDateFormat("��Ԫyyyy��MM��dd��hh:mm:ss.SSS a");
		// ����ǰʱ��������ĸ�ʽ��ʾ
		String string = sdf.format(now);
		System.out.println(string);
		
		// ��һ��ָ����ʽ���ַ���ʱ��ת��������Date
		// yyyy-MM-dd
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String str = "2015-09-30";
		try {
			Date date = sdf1.parse(str);
			System.out.println(date);
			// ��������쳣����
		} catch (ParseException e) {
			// ������ϢUnparseable date
			e.printStackTrace();
		}
	}
}
