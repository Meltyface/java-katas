package com.kinbiko.java.kata;

public class Kata6 {
	public void couldThrowExceptions(String arg) throws CheckedException {
		if (arg == "checked") {
			throw new CheckedException();
		} else if (arg == "unchecked") {
			throw new UncheckedException();
		}
	}

	public Exception handlingExceptions(String string) {
		try {
			couldThrowExceptions(string);
		} catch (Exception e) {
			return e;
		}
		return null;
	}
}

class CheckedException extends Exception {

	private static final long serialVersionUID = 1L;

}

class UncheckedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

}
