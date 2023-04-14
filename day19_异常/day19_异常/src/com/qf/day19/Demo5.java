package com.qf.day19;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Hashtable;

public class Demo5 {
	public static void main(String[] args) {
//		int n = 0;
//		try {
//			System.out.println("try");
//			int m = 5 / n;
//			return;
//		} catch (Exception e) {
//			System.out.println("catch");
//			return;
//		}finally {
//			System.out.println("finally");
//		}
		
		System.out.println(m1());
	}
	
	public static Student m1(){
		Student stu = new Student(0);
	    try{
	    	stu = new Student(1);
	        int m = 5 / 0;
	        return stu;
	    }catch(Exception e){
	    	stu = new Student(2);
	        return stu;
	    }finally{
	    	stu = new Student(3);
	    }
	}
}
