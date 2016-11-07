package org.calculator.classes;

import org.calculator.interfaces.AdvancedOperations;

/**
 * Här bygger vi upp de avanacerade funktionerna vårt program ska ha i enskilda metoder.
 * @author waxns
 *
 */
public class AdvancedMethods extends BasicMethods implements AdvancedOperations{

	/**
	 * Denna metod återger PI mutliplicerat med num1.
	 */
	public double PI(double num1) {
		
		return Math.PI * num1;
	}

	/**
	 * Denna metod återger Cosh-värdet av num1.
	 */
	public double cosh(double num1) {
		return Math.cosh(num1);
	}

	/**
	 * Denna metod återger Exp-värdet av num1.
	 */
	public double exp(double num1) {
		return Math.exp(num1);
	}

	/**
	 * Denna metod återger SquareRoot-värdet av num1.
	 */
	public double sqrt(double num1) {
		return Math.sqrt(num1);
	}

	/**
	 * Denna metod återger toRadians-värdet av num1.
	 */
	public double toRadians(double num1) {
		return Math.toRadians(num1);
	}

	/**
	 * Denna metod återger toDegrees-värdet av num1.
	 */
	public double toDegrees(double num1) {
		return Math.toDegrees(num1);
	}
	

}
