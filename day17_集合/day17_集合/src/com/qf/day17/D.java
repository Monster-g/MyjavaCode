package com.qf.day17;

import java.util.ArrayList;

public class D <T> {
	// 限制传入的参数ArrayList泛型时，必须是T或者T的子类
	public void todo(ArrayList<? extends T> t) {
		
	}
	
	// 限制传入的参数ArrayList泛型时，必须是T或者T的父类
	public void todo1(ArrayList<? super T> t) {
		
	}
}
