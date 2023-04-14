package com.qf.day15;

public class Demo6 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("cccccccccccccccccccccccccccccccccccccccc");
		// 往最后追加内容
		sb.append("hello");
		sb.append("world");
		// 修改
		sb.replace(3, 5, "aaaaaaa");
		// 插入内容
		sb.insert(1, "bbb");
		// 删除内容
		sb.delete(1, 4);
		System.out.println(sb);
	}
}
