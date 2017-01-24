package com.kinbiko.java.kata;

public class Kata5 {
	private Kata5() {}

	private static Kata5 allTheSingletonLadies = new Kata5();
	
	public static Kata5 getInstance() {
		return allTheSingletonLadies;
	}
	
	public boolean isSame(Kata5 arg) {
		return arg == allTheSingletonLadies;
	}
	
	
}
