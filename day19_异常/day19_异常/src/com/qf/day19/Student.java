package com.qf.day19;

public class Student {
	private int n;

	public Student(int n) {
		super();
		this.n = n;
	}

	@Override
	public String toString() {
		return "Student [n=" + n + "]";
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}
