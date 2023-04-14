package com.qf.day17;

public class Student<T> {
	private T name;
	
	public void setName(T name) {
		T n;
		this.name = name;
	}
	
	public T getName() {
		return name;
	}
}
