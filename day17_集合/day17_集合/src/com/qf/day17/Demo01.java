package com.qf.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo01 {
	public static void main(String[] args) {
		// ��������
		ArrayList list = new ArrayList(-100);
		// ���Ԫ��(�����)
		list.add("hello");
		// ����Ԫ�أ�ָ���±꣬������Ԫ�����Ų����
		list.add(0, "world");
//		list.add(5, "aaa"); // ����ֻ������ȷ��λ�����java.lang.IndexOutOfBoundsException: 
		// ��ȡԪ��
		Object obj = list.get(0);
		System.out.println(obj);
		// �޸�Ԫ��
		list.set(0, "aaa");
		// �õ�Ԫ�صĸ���
		int size = list.size();
		System.out.println(size);
		// ɾ��Ԫ��
		list.remove(1); // ʹ���±�ɾ��������ʹ��
		list.remove("aaa"); // ʹ�ö���ɾ������Ҫ��дequals��������ȷ
		// ����Ԫ��
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// ʹ��foreach����Ԫ��
		for (Object object : list) {
			System.out.println(object);
		}
		
		ArrayList list1 = new ArrayList();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		// ���һ��Ԫ��
		list.addAll(list1);
		// ʹ��foreach����Ԫ��
		for (Object object : list) {
			System.out.println(object);
		}
		
		// �ж��Ƿ����Ԫ�أ���Ҫ��дequals����
		boolean b = list.contains("b");
		System.out.println(b);
		// �ж��Ƿ������һ�������е�����Ԫ��
		boolean b1 = list.containsAll(list1);
		System.out.println(b1);
		// �ж����������е�Ԫ���Ƿ�һ��
		boolean b2 = list.equals(list1);
		System.out.println(b2);
		// ����һ��Ԫ�ص��±�
		int i = list.indexOf("b");
		System.out.println(i);
		// ������ת��������
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
		// �õ������в���Ԫ��
		List list2 = list.subList(0, 1);
		System.out.println(list2);
		
		// �����ֱ�����ʽ��ʹ�õ���������
		Iterator it = list.iterator(); // �õ�������
		while(it.hasNext()) { // �ж��Ƿ�����һ��Ԫ��
			Object o = it.next(); // �õ���һ��Ԫ��
			System.out.println(o);
		}
		// ���Ԫ��
		list.clear();
		System.out.println(list);
	}
}
