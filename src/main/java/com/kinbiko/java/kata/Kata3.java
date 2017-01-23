package com.kinbiko.java.kata;

public class Kata3 implements InvocationCounter {
	public static int count = 0;
	
	public int getTwiceTimesInvoked() {
		count += 1;
		return 2*count;
	}
}

