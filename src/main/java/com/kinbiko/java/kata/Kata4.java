package com.kinbiko.java.kata;

public class Kata4 {
	public static int count = 0;
	public String getColourName(int args) {
		if (count == 1) {
			return "Red";
		} else if (count == 2) {
			return "Blue";
		} else {
			return "Green";
		}
	}
	public Colour getColourInstance() {
		count += 1;
		return getColourName(count);
	}

}
