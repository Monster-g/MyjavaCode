package com.qf.day17;

import java.util.ArrayList;

public class Demo06 {
	public static void main(String[] args) {
		// ����ʹ��B����B������
		D<B> d = new D<B>();
		ArrayList<B> list = new ArrayList<B>();
		d.todo(list);
		ArrayList<C> list1 = new ArrayList<C>();
		d.todo(list1);
		// ����A��B�ĸ���
//		ArrayList<A> list2 = new ArrayList<A>();
//		d.todo(list2);
		
		// ����ʹ��B����B�ĸ���
		D<B> d1 = new D<B>();
		ArrayList<B> list3 = new ArrayList<B>();
		d.todo1(list3);
		// ����C��B������
//		ArrayList<C> list4 = new ArrayList<C>();
//		d.todo1(list4);
		ArrayList<A> list5 = new ArrayList<A>();
		d.todo1(list5);
	}
}
