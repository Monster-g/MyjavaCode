package com.qf.day15;

public class Demo1 {
	// �����������Ͷ�Ӧ��װ��
	public static void main(String[] args) {
		int n = 5;
		// ��������������ת���ɰ�װ��
		Integer in = new Integer(n);// 1��ʹ��new
		Integer in1 = n; // 2��ֱ�Ӹ�ֵ��jdk1.5�������ԣ��Զ�װ��
		Integer in2 = Integer.valueOf(n); // 3��ʹ��valueOf
		
		double d = 2.0;
		Double d1 = new Double(d);// 1��ʹ��new
		Double d2 = d; // 2��ֱ�Ӹ�ֵ��jdk1.5�������ԣ��Զ�װ��
		Double d3 = Double.valueOf(d); // 3��ʹ��valueOf
		
		// ����װ��ת���ɻ�����������
		int n1 = in; // ֱ�Ӹ�ֵ��jdk1.5�������ԣ��Զ�����
		int n2 = in.intValue(); // ʹ��intValue
		
		// �����������͵�Ĭ��ֵ��ǰ��������ʹ�ù���Ĭ��ֵ�����磺intĬ��ֵΪ0
		// ���ǰ�װ�����ڶ���Object������࣬����Ĭ��ֵΪnull
		Integer in3 = null;
		// ��װ��ͻ������������ڴ����ʱ�򶼿��Ի���ʹ��
		Integer in4 = 1;
		int n3 = new Integer(3);
		
		// ���ַ���ת��������
		int n4 = Integer.parseInt("23");
		double d4 = Double.parseDouble("25.5");
		// ת��ʧ�ܻ�����쳣java.lang.NumberFormatException
		int n5 = Integer.parseInt("23a");
	}
}
