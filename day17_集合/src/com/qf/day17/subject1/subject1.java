package com.qf.day17.subject1;

import java.util.ArrayList;
import java.util.Scanner;

public class subject1 {

	public static void main(String[] args) {
		//����һ����̬����
		ArrayList list = new ArrayList();
		//���ʮ�׸�����ArraysList������
		for (int i = 1; i <= 10; i++) {
			list.add("����" + i);//����paly��������ֵ���붯̬������
		}
		
		//ʹ��foreach�������и���
		for (int i = 0; i < list.size(); i++) {
			Song s = new Song("����" + (i + 1), "����" + (i + 1), (i + 1));//����Song���вι��췽�����и�ֵ
			System.out.println(list.get(i) + s.play());//�������и���������play������ʾ������Ϣ
			
		}
		
		
		//�����в���ĳ������
		Scanner input = new Scanner(System.in);
		System.out.println("����������Ҫ���ҵĸ�������");
		String songname = input.nextLine();
		
		boolean b1 = list.contains(songname);
		if(b1) {
			System.out.println(songname + "�ڸü�����");
		}else {
			System.out.println(songname + "���ڸü�����");
		}

	}

}
