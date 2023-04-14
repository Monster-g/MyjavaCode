package com.qf.day17;

import java.util.ArrayList;

public class Demo06 {
	public static void main(String[] args) {
		// 可以使用B或者B的子类
		D<B> d = new D<B>();
		ArrayList<B> list = new ArrayList<B>();
		d.todo(list);
		ArrayList<C> list1 = new ArrayList<C>();
		d.todo(list1);
		// 报错，A是B的父类
//		ArrayList<A> list2 = new ArrayList<A>();
//		d.todo(list2);
		
		// 可以使用B或者B的父类
		D<B> d1 = new D<B>();
		ArrayList<B> list3 = new ArrayList<B>();
		d.todo1(list3);
		// 报错，C是B的子类
//		ArrayList<C> list4 = new ArrayList<C>();
//		d.todo1(list4);
		ArrayList<A> list5 = new ArrayList<A>();
		d.todo1(list5);
	}
}
