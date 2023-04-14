package com.qf.day17;

public class Person {
	// 在方法中定义并使用，传入的参数类型与返回值类型一致
	public <T> T getName(T n) {
		T m; // 在方法内部可以声明
		return n;
	}
	
	// 报错，方法中声明的泛型只能在当前方法中使用，不能在其他方法中使用
//	public void setName(T name) {
//		
//	}
}
