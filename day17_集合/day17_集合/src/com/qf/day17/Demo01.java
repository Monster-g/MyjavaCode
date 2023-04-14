package com.qf.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo01 {
	public static void main(String[] args) {
		// 创建对象
		ArrayList list = new ArrayList(-100);
		// 添加元素(最后面)
		list.add("hello");
		// 插入元素（指定下标，其他的元素向后挪动）
		list.add(0, "world");
//		list.add(5, "aaa"); // 报错，只能向正确的位置添加java.lang.IndexOutOfBoundsException: 
		// 获取元素
		Object obj = list.get(0);
		System.out.println(obj);
		// 修改元素
		list.set(0, "aaa");
		// 得到元素的个数
		int size = list.size();
		System.out.println(size);
		// 删除元素
		list.remove(1); // 使用下标删除，优先使用
		list.remove("aaa"); // 使用对象删除，需要重写equals方法才正确
		// 遍历元素
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 使用foreach遍历元素
		for (Object object : list) {
			System.out.println(object);
		}
		
		ArrayList list1 = new ArrayList();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		// 添加一组元素
		list.addAll(list1);
		// 使用foreach遍历元素
		for (Object object : list) {
			System.out.println(object);
		}
		
		// 判断是否包含元素，需要重写equals方法
		boolean b = list.contains("b");
		System.out.println(b);
		// 判断是否包含另一个集合中的所有元素
		boolean b1 = list.containsAll(list1);
		System.out.println(b1);
		// 判断两个集合中的元素是否一致
		boolean b2 = list.equals(list1);
		System.out.println(b2);
		// 查找一个元素的下标
		int i = list.indexOf("b");
		System.out.println(i);
		// 将集合转换成数组
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
		// 得到集合中部分元素
		List list2 = list.subList(0, 1);
		System.out.println(list2);
		
		// 第三种遍历方式，使用迭代器遍历
		Iterator it = list.iterator(); // 得到迭代器
		while(it.hasNext()) { // 判断是否有下一个元素
			Object o = it.next(); // 得到下一个元素
			System.out.println(o);
		}
		// 清空元素
		list.clear();
		System.out.println(list);
	}
}
