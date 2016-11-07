
package org.calculator.test;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.calculator.classes.BasicMethods;
import org.junit.Test;
/**
 * 
 * @author Mattias Svensson
 *
 */
public class BasicMethodsTest {
	
	BasicMethods bm = new BasicMethods();
	public static final Logger LOG = Logger.getLogger(BasicMethods.class.getName());
	Random random = new Random();
	DecimalFormat df = new DecimalFormat("#,###");
	
	/**
	 * Test case to test basic method add with both numbers positive. 50 iteration and random numbers between 0 and 50
	 */
	@Test
	public void addTestBothPositiveNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *50));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.add(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method add with both numbers negative. 50 iteration and random numbers between 0 and 50
	 */
	@Test
	public void addTestBothNegativNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.add(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method add with firstnumber positive and second negative. 50 iteration and random numbers between -50 and 50
	 */
	@Test
	public void addTestFirstPositiveSecondNegativNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.add(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method add with first number negative and second positive. 50 iteration and random numbers between -50 and 50
	 */
	@Test
	public void addTestFirstNegativSecondNegativNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *50));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.add(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method add with zero. 
	 */
	@Test
	public void addTestZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		

			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.add(firstNumber, secondNumber)) , Math.round( result));
		
	}
	
	/**
	 * Test case to test basic method subtract with both numbers positive
	 */
	@Test
	public void subtractTestBothPositiveNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *50));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method subtract with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.subtract(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method subtact with both numbers negative.
	 */
	@Test
	public void subtractTestBothNegativNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method subtract with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.subtract(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method subtact with first number positive and second numbers negative
	 */
	@Test
	public void subtractTestFirstPositiveSecondNegativNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method subtract with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.subtract(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method subtract with first number negative and second positive 
	 */
	@Test
	public void subtractTestFirstNegativSecondNegativNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *50));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method subtract with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.subtract(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method add with zero
	 */
	@Test
	public void subtractTestZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		

			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method subtract with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.subtract(firstNumber, secondNumber)) , Math.round( result));
		
	}
	
	/**
	 * Test case to test basic method multipication with both numbers positive
	 */
	@Test
	public void multiplicationTestBothPositiveNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *50));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method multiplication with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.multiplication(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method multiplication with both numbers negative
	 */
	@Test
	public void multiplicationTestBothNegativNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.multiplication(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method multiplication with first number positive and second negative
	 */
	@Test
	public void multiplicationTestFirstPositiveSecondNegativNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method multiplication with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.multiplication(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method multiplication with first number negative and second number positive
	 */
	@Test
	public void multiplicationTestFirstNegativSecondNegativNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *50));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method multiplication with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.multiplication(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method multiplication with zero.
	 */
	@Test
	public void multiplicationTestZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		

			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method multiplication with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.multiplication(firstNumber, secondNumber)) , Math.round( result));
		
	}
	
	/**
	 * Test case to test basic method division with both numbers positive. random number between 1 and 50
	 */
	@Test
	public void divisionTestBothPositiveNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *50 +1 ));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *50 +1));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.division(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method division with both numbers negative
	 */
	@Test
	public void divisionTestBothNegativNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *-50 -1));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *-50 -1 ));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.division(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method division with first number positive and second negative
	 */
	@Test
	public void divisionTestFirstPositiveSecondNegativNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *50 + 1 ));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *-50 -1));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.division(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method division with first number negative and second positive
	 */
	@Test
	public void divisionTestFirstNegativSecondNegativNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = -0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *-50 -1));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *50 +1));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.division(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	/**
	 * Test case to test basic method add with zero
	 */
	@Test
	public void divisionTestZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = -0.123456789;
		

			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.division(firstNumber, secondNumber)) , Math.round( result));
		
	}
	
	/**
	 * Test case to test basic method add with second number zero
	 */
	@Test
	public void divisionTestFirstNegativSecondZeroNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = -0.123456789;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *-50 -1));
			
			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.division(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
}
