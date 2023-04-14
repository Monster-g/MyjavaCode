package com.qf.day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		// 定义一个日期的格式
		// yyyy年，yy两位数计年，MM月，dd日，HH24小时制，hh12小时制，mm分，ss秒，SSS毫秒，a上下午(AM\PM)
		SimpleDateFormat sdf = new SimpleDateFormat("公元yyyy年MM月dd日hh:mm:ss.SSS a");
		// 将当前时间以上面的格式显示
		String string = sdf.format(now);
		System.out.println(string);
		
		// 将一个指定格式的字符串时间转换成日期Date
		// yyyy-MM-dd
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String str = "2015-09-30";
		try {
			Date date = sdf1.parse(str);
			System.out.println(date);
			// 必须进行异常处理
		} catch (ParseException e) {
			// 错误信息Unparseable date
			e.printStackTrace();
		}
	}
}
