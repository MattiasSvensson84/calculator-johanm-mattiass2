package org.calculator.classes;

import org.calculator.interfaces.BasicOperations;

public class BasicMethods implements BasicOperations{
	
	public double add(double firstNumber, double secondNumber){
		return firstNumber + secondNumber;
	}
	public double subtract(double firstNumber, double secondNumber){
		return firstNumber - secondNumber;
	}
	public double multiplication(double firstNumber, double secondNumber){
		return firstNumber * secondNumber;
	}
	public double division (double firstNumber, double secondNumber){
		double result = firstNumber / secondNumber;
		if (Double.isInfinite(result)){
			System.out.println("Something wrong with the operation! "+"Maybe you tried to divide by");
			return -0.123456789;
		} else {
			return firstNumber / secondNumber;
		}
	}
}