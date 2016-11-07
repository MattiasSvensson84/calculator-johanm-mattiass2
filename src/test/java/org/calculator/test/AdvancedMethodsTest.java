package org.calculator.test;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.calculator.classes.AdvancedMethods;
import org.junit.Test;

/**
 * Här bygger vi testfunktionerna som ska testa metoderna i AdvancedMethods.
 * @author waxns
 *
 */
public class AdvancedMethodsTest {
	AdvancedMethods am = new AdvancedMethods();
	public static final Logger LOG = Logger.getLogger(AdvancedMethods.class.getName());
	Random random = new Random();
	DecimalFormat df = new DecimalFormat("#,###");
	
	/**
	 * Här testar vi PI med ett positivt random-nummer.
	 */
	@Test
	public void testPIPositiveNumber() {
		double num1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			num1 = Double.valueOf(df.format(random.nextDouble() *50));
			result = num1 * Math.PI;
			LOG.info("Testing the methods PI with positive number "+ num1 + " with the result: " + result);
			assertEquals(Math.round(am.PI(num1)), Math.round(result));
		}
	}
	/**
	 * Här testar vi PI med ett negativt random-nummer.
	 */
	@Test
	public void testPINegativeNumber() {
		double num1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			num1 = Double.valueOf(df.format(random.nextDouble() *-50));
			result = num1 * Math.PI;
			LOG.info("Testing the methods PI with negative number "+ num1 + " with the result: " + result);
			assertEquals(Math.round(am.PI(num1)), Math.round(result));
		}		
	}
	/**
	 * Här testar vi Cosh med ett positivt random-nummer.
	 */
	@Test
	public void testCoshPositiveNumber() {
		double num1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			num1 = Double.valueOf(df.format(random.nextDouble() *50));
			result = Math.cosh(num1);
			LOG.info("Testing the method Cosh with positive number " + num1 + " with the result: " + result);
			assertEquals(Math.round(am.cosh(num1)), Math.round(result));
		}
	}
	/**
	 * Här testar vi Cosh med ett negativt random-nummer.
	 */
	@Test
	public void testCoshNegativeNumber() {
		double num1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			num1 = Double.valueOf(df.format(random.nextDouble() *-50));
			result = Math.cosh(num1);
			LOG.info("Testing the method Cosh with negative number " + num1 + " and the result: " + result);
			assertEquals(Math.round(am.cosh(num1)), Math.round(result));
		}
	}
	/**
	 * Här testar vi Exp med ett positivt random-nummer.
	 */
	@Test
	public void testExpPositiveNumber() {
		double num1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			num1 = Double.valueOf(df.format(random.nextDouble() *50));
			result = Math.exp(num1);
			LOG.info("Testing the method Exp with positive number " + num1 + " and the result: " + result);
			assertEquals(Math.round(am.exp(num1)), Math.round(result));
		}
	}
	/**
	 * Här testar vi Exp med ett negativt random-nummer.
	 */
	@Test
	public void testExpNegativeNumber() {
		double num1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			num1 = Double.valueOf(df.format(random.nextDouble() *-50));
			result = Math.exp(num1);
			LOG.info("Testing the method Exp with negative number " + num1 + " and the result: " + result);
			assertEquals(Math.round(am.exp(num1)), Math.round(result));
		}
	}
	/**
	 * Här testar vi SquareRoot med ett positivt random-nummer.
	 */
	@Test
	public void testSqrtPositiveNumber() {
		double num1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			num1 = Double.valueOf(df.format(random.nextDouble() *50));
			result = Math.sqrt(num1);
			LOG.info("Testing the method SquareRoot with positive number " + num1 + " and the result: " + result);
			assertEquals(Math.round(am.sqrt(num1)), Math.round(result));
		}
	}
	/**
	 * Här testar vi SquareRoot med ett negativt random-nummer.
	 */
	@Test
	public void testSqrtNegativeNumber() {
		double num1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			num1 = Double.valueOf(df.format(random.nextDouble() *-50));
			result = Math.sqrt(num1);
			LOG.info("Testing the method SquareRoot with negative number " + num1 + " and the result: " + result);
			assertEquals(Math.round(am.sqrt(num1)), Math.round(result));
		}
	}
	/**
	 * Här testar vi toRadians med ett positivt random-nummer.
	 */
	@Test
	public void testToRadiansPositiveNumber() {
		double num1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			num1 = Double.valueOf(df.format(random.nextDouble() *50));
			result = Math.toRadians(num1);
			LOG.info("Testing the method toRadians with positive number " + num1 + " and the result: " + result);
			assertEquals(Math.round(am.toRadians(num1)), Math.round(result));
		}
	}
	/**
	 * Här testar vi toRadians med ett negativt random-nummer.
	 */
	@Test
	public void testToRadiansNegativeNumber() {
		double num1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			num1 = Double.valueOf(df.format(random.nextDouble() *-50));
			result = Math.toRadians(num1);
			LOG.info("Testing the method toRadians with negative number " + num1 + " and the result: " + result);
			assertEquals(Math.round(am.toRadians(num1)), Math.round(result));
		}
	}
	/**
	 * Här testar vi toDegrees med ett positivt random-nummer.
	 */
	@Test
	public void testToDegreesPositiveNumber() {
		double num1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			num1 = Double.valueOf(df.format(random.nextDouble() *50));
			result = Math.toDegrees(num1);
			LOG.info("Testing the method toDegrees with positive number " + num1 + " and the result: " + result);
			assertEquals(Math.round(am.toDegrees(num1)), Math.round(result));
		}
	}
	/**
	 * Här testar vi toDegrees med ett negativt random-nummer.
	 */
	@Test
	public void testToDegreesNegativeNumber() {
		double num1 = 0;
		double result = 0;
		
		for (int i = 0; i < 50; i++) {
			num1 = Double.valueOf(df.format(random.nextDouble() *-50));
			result = Math.toDegrees(num1);
			LOG.info("Testing the method toDegrees with negative number " + num1 + " and the result: " + result);
			assertEquals(Math.round(am.toDegrees(num1)), Math.round(result));
		}
	}
	

}
