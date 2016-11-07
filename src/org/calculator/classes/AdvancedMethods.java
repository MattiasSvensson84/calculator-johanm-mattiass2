package org.calculator.classes;

import org.calculator.interfaces.AdvancedOperations;

/**
 * H�r bygger vi upp de avanacerade funktionerna v�rt program ska ha i enskilda metoder.
 * @author waxns
 *
 */
public class AdvancedMethods extends BasicMethods implements AdvancedOperations{

	/**
	 * Denna metod �terger PI mutliplicerat med num1.
	 */
	public double PI(double num1) {
		
		return Math.PI * num1;
	}

	/**
	 * Denna metod �terger Cosh-v�rdet av num1.
	 */
	public double cosh(double num1) {
		return Math.cosh(num1);
	}

	/**
	 * Denna metod �terger Exp-v�rdet av num1.
	 */
	public double exp(double num1) {
		return Math.exp(num1);
	}

	/**
	 * Denna metod �terger SquareRoot-v�rdet av num1.
	 */
	public double sqrt(double num1) {
		return Math.sqrt(num1);
	}

	/**
	 * Denna metod �terger toRadians-v�rdet av num1.
	 */
	public double toRadians(double num1) {
		return Math.toRadians(num1);
	}

	/**
	 * Denna metod �terger toDegrees-v�rdet av num1.
	 */
	public double toDegrees(double num1) {
		return Math.toDegrees(num1);
	}
	

}
