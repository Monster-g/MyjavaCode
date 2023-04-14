package com.qf.day19;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Hashtable;

public class Demo4 {
	public static void main(String[] args) {
		int [] arr = {};
		try {
			m1(arr);
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void m1(int [] arr) throws ParseException, SQLException {
		int min = min(arr);
		System.out.println(min);
	}
	
	public static int min(int [] arr) throws ParseException, SQLException {
		if(arr == null) {
			throw new ParseException("数组不能为空", 0);
		}
		if(arr.length == 0) {
			throw new SQLException("数组长度不能为0");
		}
		
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
