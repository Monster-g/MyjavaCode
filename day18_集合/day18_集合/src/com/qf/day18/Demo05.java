package com.qf.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Demo05 {
	public static void main(String[] args) {
		List<Student> list2 = Arrays.asList(
					new Student("����", "3", "��"), 
					new Student("����", "4", "��"), 
					new Student("����", "2", "��"), 
					new Student("����", "1", "��")
				);

		// ��ҪStudent��дcomparable�ӿڣ�����������ʱ�����
		// ���ݱȽ����ж��Ƿ��ظ�
		TreeSet<Student> set = new TreeSet<Student>(list2);
		System.out.println(set);
		
		
	}
}
