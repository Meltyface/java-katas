package com.kinbiko.java.kata;

public class Kata4 {
	public static int count = 0;
	
	public Colour getColourInstance() {
		count += 1;
		if (count == 1) {
			return new Red();
		} else if (count == 2) {
			return new Blue();
		} else {
			return new Green();
		}
	}

}

class Red implements Colour {
	public String getColourName() {
		return "Red";
	}
}

class Blue implements Colour {
	public String getColourName() {
		return "Blue";
	}
}

class Green implements Colour {
	public String getColourName() {
		return "Green";
	}
}


