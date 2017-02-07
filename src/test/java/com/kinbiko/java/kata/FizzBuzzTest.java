package com.kinbiko.java.kata;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
	FizzBuzz target = new FizzBuzz();

	@Test
	public void fizzBuzzUnitInput() {
		assertEquals("1", target.fizzBuzzMethod(1));
		// assertEquals(expected, actual)
	}

	@Test
	public void fizzBuzzSecondTest() {
		assertEquals("2", target.fizzBuzzMethod(2));
		// assertEquals(expected, actual)
	}
	
	@Test
	public void fizzBuzzThirdTest() {
		assertEquals("Fizz" , target.fizzBuzzMethod(3));
		// assertEquals(expected, actual)
	}
	
	@Test
	public void fizzBuzzFourthTest() {
		assertEquals("4", target.fizzBuzzMethod(4));
		// assertEquals(expected, actual)
	}
	
	@Test
	public void fizzBuzzFifthTest() {
		assertEquals("Buzz", target.fizzBuzzMethod(5));
		// assertEquals(expected, actual)
	}
	
	@Test
	public void fizzBuzzSixthTest() {
		assertEquals("Fizz" , target.fizzBuzzMethod(6));
		// assertEquals(expected, actual)
	}
	
	@Test
	public void fizzBuzzTenthTest() {
		assertEquals("Buzz", target.fizzBuzzMethod(10));
		// assertEquals(expected, actual)
	}
	
	@Test
	public void fizzBuzzFifteenthTest() {
		assertEquals("FizzBuzz", target.fizzBuzzMethod(15));
		// assertEquals(expected, actual)
	}
	
	@Test
	public void oneToOneHundredTest() {
		for (int j = 1; j < 101; j++) {
			System.out.println(target.fizzBuzzMethod(j));
		}
	}
}
