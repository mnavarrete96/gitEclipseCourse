package com.mant.app;

public class Calculator {
	
	public int add(int valueOne, int valueTwo) {
		return valueOne + valueTwo;
	}
	
	public int multiplication(int valueOne, int valueTwo) {
		return valueOne * valueTwo;
	}
	
	public int division(int valueOne, int valueTwo) {
		return valueOne / valueTwo;
	}
	
	public int substract(int valueOne, int valueTwo) {
		return valueOne / valueTwo;
	}
	
	public int remainder(int valueOne, int valueTwo) {
		return valueOne % valueTwo;
	}
	
	public int minValue(int valueOne, int valueTwo) {
		if(valueOne < valueTwo) {
			return valueOne;
		}
		
		return valueTwo;
	}
	
	public int maxValue(int valueOne, int valueTwo) {
		if(valueOne > valueTwo) {
			return valueOne;
		}
		
		return valueTwo;
	}
}
