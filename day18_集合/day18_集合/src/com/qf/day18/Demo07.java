package com.qf.day18;

public class Demo07 {
	public static void main(String[] args) {
		System.out.println(15 & 32);
		
		/*
		 1010 0010 0010 0101
		 0000 0000 0001 1111
		 */
	}
	
	static final int MAXIMUM_CAPACITY = 1 << 30;
	
	static final int tableSizeFor(int cap) {
	    int n = cap - 1;
	    n |= n >>> 1;
	    n |= n >>> 2;
	    n |= n >>> 4;
	    n |= n >>> 8;
	    n |= n >>> 16;
	    return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
	}
}
