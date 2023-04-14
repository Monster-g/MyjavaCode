package com.qf.day16;

import java.util.Calendar;
import java.util.Date;

public class Demo2 {
	public static void main(String[] args) {
		// 日历类
		// 得到日历类对象，不能使用new，只有一个对象
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		// time=1647829077175,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
		// zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,
		// dstSavings=0,useDaylight=false,transitions=19,lastRule=null],
		// firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,
		// MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,
		// DAY_OF_YEAR=80,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,
		// HOUR=10,HOUR_OF_DAY=10,MINUTE=17,SECOND=57,MILLISECOND=175,ZONE_OFFSET=28800000,DST_OFFSET=0
		
		// 得到年份
		System.out.println(c.get(Calendar.YEAR));
		// 得到今天是一年的第多少天
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		// 设置日历的日期时间2015-5-30
		c.set(Calendar.YEAR, 2015);
		c.set(Calendar.MONTH, 4);
		c.set(Calendar.DAY_OF_MONTH, 30);
		// 一次设置多个(6月)
		c.set(2016, 5, 25);
		// 一次设置所有
		c.set(2020, 10, 20, 18, 36, 59);
		
		// 将日历转换成Date
		Date d = c.getTime();
		System.out.println(d);
		// 将Date转换成日历
		Date now = new Date();
		c.setTime(now);
		
		// 返回毫秒
		long timeInMillis = c.getTimeInMillis();
		System.out.println(timeInMillis);
		
		// 设置毫秒
		c.setTimeInMillis(timeInMillis);
		
		//用来计算
		c.add(Calendar.DAY_OF_MONTH, 180); // 180天后
		System.out.println(c.getTime());
		// 180小时前
		c.add(Calendar.HOUR_OF_DAY, -180);
		System.out.println(c.getTime());
	}
}
