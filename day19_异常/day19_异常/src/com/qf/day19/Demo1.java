package com.qf.day19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ�����ڣ���ʽΪ��2020-02-12����");
		String s = input.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = sdf.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
