package com.qf.day17.subject1;

import java.util.ArrayList;
import java.util.Scanner;

public class subject1 {

	public static void main(String[] args) {
		//创建一个动态数组
		ArrayList list = new ArrayList();
		//添加十首歌曲到ArraysList集合中
		for (int i = 1; i <= 10; i++) {
			list.add("歌曲" + i);//调用paly方法将数值放入动态数组中
		}
		
		//使用foreach遍历所有歌曲
		for (int i = 0; i < list.size(); i++) {
			Song s = new Song("歌曲" + (i + 1), "歌手" + (i + 1), (i + 1));//调用Song的有参构造方法进行赋值
			System.out.println(list.get(i) + s.play());//遍历所有歌曲，调用play方法显示歌曲信息
			
		}
		
		
		//集合中查找某个歌曲
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你需要查找的歌曲名：");
		String songname = input.nextLine();
		
		boolean b1 = list.contains(songname);
		if(b1) {
			System.out.println(songname + "在该集合中");
		}else {
			System.out.println(songname + "不在该集合中");
		}

	}

}
