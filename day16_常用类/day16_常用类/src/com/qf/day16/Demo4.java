package com.qf.day16;

public class Demo4 {
	public static void main(String[] args) {
		// 数组复制
//		System.arraycopy(src, srcPos, dest, destPos, length);
		// 得到系统毫秒数时间
		System.out.println(System.currentTimeMillis());
		// 建议System在有空时尽快进行垃圾回收
		System.gc();
		// 退出系统，一般用于客户端开发
		System.exit(0);
	}
}
