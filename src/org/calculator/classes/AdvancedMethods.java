package org.calculator.classes;

import org.calculator.interfaces.AdvancedOperations;

public class AdvancedMethods extends BasicMethods implements AdvancedOperations{

	public double PI(double num1) {
		return Math.PI;
	}

	public double pow(double base, double exponent) {
		return Math.pow(base, exponent);
	}

	public double exp(double num1) {
		return Math.exp(num1);
	}

	public double sqrt(double num1) {
		return Math.sqrt(num1);
	}

	public double toRadians(double num1) {
		return Math.toRadians(num1);
	}

	public double toDegrees(double num1) {
		return Math.toDegrees(num1);
	}
	

}
