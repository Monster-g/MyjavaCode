package com.qf.day15;

public class Demo5 {
	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		String ab = "ab";
		String s1 = a + b; // ʹ��StringBuilder���������Ľ�����൱��newһ������
		System.out.println(s1 == ab); // false
		String s2 = a + "b"; // ʹ��StringBuilder���������Ľ�����൱��newһ������
		System.out.println(s2 == ab); // false
		// ����������������Բ��ᷢ�������ı仯������ab�����Ա�����������Ż���ֱ�ӽ������Ż�ΪString s3 = "ab";
		String s3 = "a" + "b"; 
		System.out.println(s3 == ab); // true
		// ����������������Բ��ᷢ�������ı仯������ab�����Ա�����������Ż���ֱ�ӽ������Ż�ΪString s4 = "ab";
		final String a1 = "a";
		String s4 = a1 + "b";
		System.out.println(s4 == ab); // true
		String s5 = a.concat(b); // ƴ���ַ����������new��
		System.out.println(s5 == ab); // false
		String s6 = ab.concat(""); // ��ƴ�ӵ�����Ϊnull���߳���Ϊ0ʱ��ֱ�ӷ���ԭ�ַ���
		System.out.println(s6 == ab); // true
		String s7 = s2.intern(); // ֱ�ӵõ��������еĵ�ַ���൱��String s7 = "ab";
		System.out.println(s7 == ab); // true
	}
}
