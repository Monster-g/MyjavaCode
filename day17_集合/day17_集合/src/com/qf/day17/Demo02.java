package com.qf.day17;

import java.util.LinkedList;

public class Demo02 {
	public static void main(String[] args) {
		// LinkedList���е��÷�
		LinkedList list = new LinkedList();
		// ���Ԫ��
		list.add("aaa"); // �൱��addLast
		// ��ӵ����
		list.addLast("bbb");
		// ��ӵ���ͷ
		list.addFirst("ccc");
		System.out.println(list);
		
		// �õ���ǰ���Ԫ��
		Object element = list.element();
		System.out.println(element);
		// �õ���ǰ���Ԫ��
		Object first = list.getFirst();
		System.out.println(first);
		// �õ�������Ԫ��
		Object last = list.getLast();
		System.out.println(last);
		// ������һ��Ԫ�أ��õ���һ��Ԫ�أ��������ڼ���ɾ����
		Object pop = list.pop();
		System.out.println(pop);
		System.out.println(list);
		// ��ͷ�����Ԫ��
		list.push("ccc");
		System.out.println(list);
	}
}
