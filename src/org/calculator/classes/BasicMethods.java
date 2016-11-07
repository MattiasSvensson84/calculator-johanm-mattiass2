package org.calculator.classes;

import org.calculator.interfaces.BasicOperations;
/**
 * 
 * @author Johan Melin
 *
 */
public class BasicMethods implements BasicOperations{
	
	/**
	 * Basic method to add two numbers
	 */
	public double add(double firstNumber, double secondNumber){
		return firstNumber + secondNumber;
	}
	
	/**
	 * Basic method to subtract two numbers
	 */
	public double subtract(double firstNumber, double secondNumber){
		return firstNumber - secondNumber;
	}
	/**
	 * Basic method to multiplication two numbers
	 */
	public double multiplication(double firstNumber, double secondNumber){
		return firstNumber * secondNumber;
	}
	/**
	 * Basic method to add division numbers. 
	 * If numerator is zero then you should have a message
	 */
	public double division (double firstNumber, double secondNumber){
		double result = firstNumber / secondNumber;
		if (Double.isInfinite(result)){
			System.out.println("Something wrong with the operation! "+"Maybe you tried to divide by 0?");
			return -0.123456789;
		} else {
			return firstNumber / secondNumber;
		}
	}
}