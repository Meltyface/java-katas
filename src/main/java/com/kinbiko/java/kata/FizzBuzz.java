package com.kinbiko.java.kata;

public class FizzBuzz {
	// Just have one method - should return a string
	// If Int arg % 3 == 0 return "Fizz"
	// If Int arg % 5 == 0 return "Buzz"
	// If Int arg % 3 == 0 && Int arg % 5 == 0 return "FizzBuzz"
	// Else return String(arg)

	public String fizzBuzzMethod(int arg) {
		if (arg % 15 == 0) {
			return "FizzBuzz";
		}
		if (arg % 3 == 0) {
			return "Fizz";
		}
		if (arg % 5 == 0) {
			return "Buzz";
		}
		return "" + arg;
	}

	public String RogerFizzBuzz(int arg) {
		String a = "";
		a += arg % 3 == 0 ? "Fizz" : "";
		a += arg % 5 == 0 ? "Buzz" : "";
		a += "".equals(a) ? arg : "";
		return a;
	}

}
