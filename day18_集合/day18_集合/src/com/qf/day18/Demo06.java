package com.qf.day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo06 {
	public static void main(String[] args) {
		// key��value���������������ͣ�����һ���Ƽ�keyʹ��String����
		HashMap<String, Student> map = new HashMap<String, Student>();
		// ���Ԫ��
		map.put("zhangsan", new Student("����", "1", "��"));
		map.put("lisi", new Student("����", "2", "��"));
		map.put("wangwu", new Student("����", "3", "��"));
		System.out.println(map);
		// ��ȡԪ��
		Student student = map.get("lisi");
		System.out.println(student);
		// ɾ��Ԫ��
//		map.remove("lisi");
		// ��ȡ���ϵĴ�С
		int size = map.size();
		System.out.println(size);
		// �õ�key�ļ��ϲ�����(�Ƽ�ʹ�ñ�����ʽ)
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println("��Ϊ��" + key + "��ֵΪ��" + map.get(key));
		}
		// ֱ�ӵõ�ֵ��
		Collection<Student> values = map.values();
		for (Student stu : values) {
			System.out.println(stu);
		}
		// �����ͬkey��Ԫ�أ�ֵ�Ḳ��
		map.put("wangwu", new Student("����", "4", "��"));
		// �õ���ֵ�ļ���
		Set<Entry<String,Student>> set2 = map.entrySet();
		for (Entry<String, Student> entry : set2) {
			System.out.println("��Ϊ��" + entry.getKey() + "��ֵΪ��" + entry.getValue());
		}
		
		// keyʹ�ö���
		HashMap<Student, String> map1 = new HashMap<Student, String>();
		// ����ӵĶ���������ͬ�����ϣ���串�ǣ�Ӧ����дhashCode��equals����
		map1.put(new Student("����", "1", "��"), "zhangsan");
		map1.put(new Student("����", "1", "��"), "lisi");
		System.out.println(map1);
		
		// key��ֵ������Ϊnull
		map1.put(null, "wangwu");
		map1.put(null, "zhaoliu");
		map1.put(null, null);
		System.out.println(map1.get(null));
	}
}
