package com.qf.day15;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args) {
		String s = "hello, world! hello, world";
		// �����±��ȡ�ַ�
		char ch = s.charAt(0);
		System.out.println(ch);
		// �ж�һ���ַ����Ƿ������һ���ַ���
		boolean b = s.contains("llo");
		System.out.println(b);
		// ���ַ���ת�����ַ�����
		char[] array = s.toCharArray();
		System.out.println(Arrays.toString(array));
		// ����һ���ַ�������һ���ַ������״γ��ֵ�λ�ã��õ���Ӧ���±꣬��������ڷ���-1
		int index = s.indexOf("world");
		System.out.println(index);
		// ����һ���ַ�������һ���ַ����г��ֵ�λ�ã������ʼ���ң��õ���Ӧ���±꣬��������ڷ���-1
		int index1 = s.lastIndexOf("world");
		System.out.println(index1);
		// �����ַ����ĳ���
		int length = s.length();
		System.out.println(length);
		// ȥ���ַ���ǰ��Ŀո�
		String s1 = "        hello, world    ";
		s1 = s1.trim(); // �ַ�����ֵ�ǲ��ɱ�ģ����иı��ַ����Ľ���ķ���һ���з���ֵ��Ӧ�ý��շ���ֵ
		System.out.println(s1);
		// ��Сд��ĸת�ɴ�д
		s = s.toUpperCase();
		System.out.println(s);
		// ����д��ĸת��Сд
		s = s.toLowerCase();
		System.out.println(s);
		// �ж�һ���ַ����Ƿ�����һ���ַ�����β
		boolean b1 = s.endsWith("rld");
		System.out.println(b1);
		// �ж�һ���ַ����Ƿ�����һ���ַ�����ͷ
		boolean b2 = s.startsWith("rld");
		System.out.println(b2);
		// ��һ���ַ����еİ������ַ���ȫ���滻�������ַ���
		s = s.replace("hello", "a");
		System.out.println(s);
		// ��ָ��λ�ÿ�ʼ��ȡ�����ַ�������ȡ�������е�
		System.out.println(s.substring(4));
		// ��ָ��λ�ÿ�ʼ��ȡ�����ַ�������ȡ����һ��λ�ã���4��8
		System.out.println(s.substring(4, 8));
		// ���ַ�������ָ�������ݽ����и��һ������
		String[] strings = s.split("!");
		System.out.println(Arrays.toString(strings));
		// �������ַ�������ƴ��
		String s2 = "hello";
		String s3 = "world";
		s2 = s2.concat(s3);
		System.out.println(s2);
	}
}
