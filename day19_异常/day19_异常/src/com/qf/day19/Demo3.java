package com.qf.day19;

import java.util.Hashtable;

public class Demo3 {
	public static void main(String[] args) {
		int [] arr = {};
		System.out.println(min(arr));
	}
	
	public static int min(int [] arr) {
		if(arr == null || arr.length == 0) {
			throw new RuntimeException("数组不能为空");
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
