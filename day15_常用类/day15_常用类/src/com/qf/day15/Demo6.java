package com.qf.day15;

public class Demo6 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("cccccccccccccccccccccccccccccccccccccccc");
		// �����׷������
		sb.append("hello");
		sb.append("world");
		// �޸�
		sb.replace(3, 5, "aaaaaaa");
		// ��������
		sb.insert(1, "bbb");
		// ɾ������
		sb.delete(1, 4);
		System.out.println(sb);
	}
}
