package com.qf.day16;

import java.util.Calendar;
import java.util.Date;

public class Demo2 {
	public static void main(String[] args) {
		// ������
		// �õ���������󣬲���ʹ��new��ֻ��һ������
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		// time=1647829077175,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
		// zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,
		// dstSavings=0,useDaylight=false,transitions=19,lastRule=null],
		// firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,
		// MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,
		// DAY_OF_YEAR=80,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,
		// HOUR=10,HOUR_OF_DAY=10,MINUTE=17,SECOND=57,MILLISECOND=175,ZONE_OFFSET=28800000,DST_OFFSET=0
		
		// �õ����
		System.out.println(c.get(Calendar.YEAR));
		// �õ�������һ��ĵڶ�����
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		// ��������������ʱ��2015-5-30
		c.set(Calendar.YEAR, 2015);
		c.set(Calendar.MONTH, 4);
		c.set(Calendar.DAY_OF_MONTH, 30);
		// һ�����ö��(6��)
		c.set(2016, 5, 25);
		// һ����������
		c.set(2020, 10, 20, 18, 36, 59);
		
		// ������ת����Date
		Date d = c.getTime();
		System.out.println(d);
		// ��Dateת��������
		Date now = new Date();
		c.setTime(now);
		
		// ���غ���
		long timeInMillis = c.getTimeInMillis();
		System.out.println(timeInMillis);
		
		// ���ú���
		c.setTimeInMillis(timeInMillis);
		
		//��������
		c.add(Calendar.DAY_OF_MONTH, 180); // 180���
		System.out.println(c.getTime());
		// 180Сʱǰ
		c.add(Calendar.HOUR_OF_DAY, -180);
		System.out.println(c.getTime());
	}
}
