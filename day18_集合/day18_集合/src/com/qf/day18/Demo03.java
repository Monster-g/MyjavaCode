package com.qf.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo03 {
	public static void main(String[] args) {
		List<Student> list2 = Arrays.asList(
					new Student("����", "3", "��"), 
					new Student("����", "4", "��"), 
					new Student("����", "2", "��"), 
					new Student("����", "1", "��")
				);

		// �������˳��
		Collections.shuffle(list2);
		System.out.println(list2);
	}
}
