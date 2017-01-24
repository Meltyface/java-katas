package com.kinbiko.java.kata;

public class Kata7 {
	public boolean flipPrimitiveBoolean(boolean args) {
		return !args;
	}
	
	public boolean doPrimitiveBooleanOr(boolean arg1, boolean arg2) {
		return arg1 || arg2;
	}
	
	public boolean doPrimitiveBooleanAnd(boolean arg1, boolean arg2) {
		return arg1 && arg2;
	}
	
	public Boolean flipObjectBoolean(Boolean arg) {
		return arg == null ? null : !arg;
	}
	
	public Boolean doObjectBooleanOr(Boolean arg1, Boolean arg2) {
		return (arg1 == null) || (arg2 == null) ? null : 
			doPrimitiveBooleanOr(arg1, arg2);
	}
	
	public Boolean doObjectBooleanAnd(Boolean arg1, Boolean arg2) {
		return (arg1 == null) || (arg2 == null) ? null : 
			doPrimitiveBooleanAnd(arg1, arg2);
	}
	
	public int doPrimitiveIntegerAdd(int A, int B) {
		return A + B;
	}
	
	public int doPrimitiveIntegerSubtract(int A, int B) {
		return A - B;
	}
	
	public int doPrimitiveIntegerMultiply(int A, int B) {
		return A * B;
	}
	
	public int doPrimitiveIntegerDivide(int A, int B) {
		return A / B;
	}
	
	public Integer doObjectIntegerAdd(Integer A, Integer B) {
		if (A == null || B == null) {
			return null;
		} else {
			return A + B;
		}
	}
	
	public Integer doObjectIntegerSubtract(Integer A, Integer B) {
		if (A == null || B == null) {
			return null;
		} else {
			return A - B;
		}
	}
	
	public Integer doObjectIntegerMultiply(Integer A, Integer B) {
		if (A == null || B == null) {
			return null;
		} else {
			return A * B;
		}
	}
	
	public Integer doObjectIntegerDivide(Integer A, Integer B) {
		if (A == null || B == null) {
			return null;
		} else {
			return A / B;
		}
	}
}

