package com.kinbiko.java.kata;

public class Kata7 {
	public boolean flipPrimitiveBoolean(boolean args) {
		return !args;
	}
	
	public boolean doPrimitiveBooleanOr(boolean arg1, boolean arg2) {
		if (arg1 || arg2 == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean doPrimitiveBooleanAnd(boolean arg1, boolean arg2) {
		if (arg1 && arg2 == true) {
			return true; 
		} else {
			return false;
		}
	}
	
	public Boolean flipObjectBoolean(Boolean arg) {
		if (arg == null) {
			return null;
		} else {
			return !arg;
		}
	}
	
	public Boolean doObjectBooleanOr(Boolean arg1, Boolean arg2) {
		if (arg1 || arg2 == null) {
			return null;
		} else {
			if (Boolean.TRUE.equals(arg1) || Boolean.TRUE.equals(arg2)) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}
		}
	}
	
	public Boolean doObjectBooleanAnd(Boolean arg1, Boolean arg2) {
		if (arg1 || arg2 == null) {
			return null;
		} else {
			if (Boolean.TRUE.equals(arg1) && Boolean.TRUE.equals(arg2)) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}		
		}
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
		if (A || B == null) {
			return null;
		} else {
			return A + B;
		}
	}
	
	public Integer doObjectIntegerSubtract(Integer A, Integer B) {
		if (A || B == null) {
			return null;
		} else {
			return A - B;
		}
	}
	
	public Integer doObjectIntegerMultiply(Integer A, Integer B) {
		if (A || B == null) {
			return null;
		} else {
			return A * B;
		}
	}
	
	public Integer doObjectIntegerDivide(Integer A, Integer B) {
		if (A || B == null) {
			return null;
		} else {
			return A / B;
		}
	}
}

