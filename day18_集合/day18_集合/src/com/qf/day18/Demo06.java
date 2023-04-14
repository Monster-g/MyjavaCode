package com.qf.day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo06 {
	public static void main(String[] args) {
		// key和value都可以是任意类型，但是一般推荐key使用String类型
		HashMap<String, Student> map = new HashMap<String, Student>();
		// 添加元素
		map.put("zhangsan", new Student("张三", "1", "男"));
		map.put("lisi", new Student("李四", "2", "男"));
		map.put("wangwu", new Student("王五", "3", "男"));
		System.out.println(map);
		// 获取元素
		Student student = map.get("lisi");
		System.out.println(student);
		// 删除元素
//		map.remove("lisi");
		// 获取集合的大小
		int size = map.size();
		System.out.println(size);
		// 得到key的集合并遍历(推荐使用遍历方式)
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println("键为：" + key + "，值为：" + map.get(key));
		}
		// 直接得到值集
		Collection<Student> values = map.values();
		for (Student stu : values) {
			System.out.println(stu);
		}
		// 添加相同key的元素，值会覆盖
		map.put("wangwu", new Student("赵六", "4", "男"));
		// 得到键值的集合
		Set<Entry<String,Student>> set2 = map.entrySet();
		for (Entry<String, Student> entry : set2) {
			System.out.println("键为：" + entry.getKey() + "，值为：" + entry.getValue());
		}
		
		// key使用对象
		HashMap<Student, String> map1 = new HashMap<Student, String>();
		// 当添加的对象内容相同，如果希望其覆盖，应该重写hashCode和equals方法
		map1.put(new Student("张三", "1", "男"), "zhangsan");
		map1.put(new Student("张三", "1", "男"), "lisi");
		System.out.println(map1);
		
		// key和值都可以为null
		map1.put(null, "wangwu");
		map1.put(null, "zhaoliu");
		map1.put(null, null);
		System.out.println(map1.get(null));
	}
}
