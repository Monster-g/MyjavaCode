package com.qf.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo02 {
	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("d");
//		list.add("a");
//		list.add("b");
//		list.add("c");
		// �����е�Ԫ����֪���Ҳ���ʹ��ѭ��ʱ������ʹ�����·���
		// ��������ķ����õ���List����ִ�д󲿷�д����������ɾ������ӵȣ�֧�ִ󲿷ֶ�����
		List<String> list = Arrays.asList("d", "a", "b", "c");
		// ����ʹ������İ취����ArrayList
//		list = new ArrayList<String>(list);
//		list.remove(1);
//		list.set(1, "f"); // ֧�����ã���Ϊ��������
		System.out.println(list);
		// �Լ��Ͻ�������
		Collections.sort(list);
		System.out.println(list);
		
		List<Student> list2 = Arrays.asList(
					new Student("����", "3", "��"), 
					new Student("����", "4", "��"), 
					new Student("����", "2", "��"), 
					new Student("����", "1", "��")
				);
		// ������Ҫ����ʵ��Comparable�ӿ�
		Collections.sort(list2);
		System.out.println(list2);
		
		
	}
	
	
	
}
