package org.calculator.test;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.calculator.classes.BasicMethods;
import org.junit.Test;

public class BasicMethodsTest {
	
	BasicMethods bm = new BasicMethods();
	public static final Logger LOG = Logger.getLogger(BasicMethods.class.getName());
	Random random = new Random();
	DecimalFormat df = new DecimalFormat("#,###");

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
	@Test
	public void addTestZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		

			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.add(firstNumber, secondNumber)) , Math.round( result));
		
	}
	
	@Test
	public void subtractTestBothPositiveNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *50));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.subtract(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	@Test
	public void subtractTestBothNegativNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.subtract(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	@Test
	public void subtractTestFirstPositiveSecondNegativNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.subtract(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	
	@Test
	public void subtractTestFirstNegativSecondNegativNumber() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		
		for (int i = 0; i <= 50; i++){
			firstNumber = Double.valueOf(df.format(random.nextDouble() *-50));
			secondNumber = Double.valueOf(df.format(random.nextDouble() *50));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.subtract(firstNumber, secondNumber)) , Math.round( result));
		}
	}
	@Test
	public void subtractTestZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		

			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method add with: " + firstNumber + " and " + secondNumber + " with the result: " + result);
			assertEquals(Math.round(bm.subtract(firstNumber, secondNumber)) , Math.round( result));
		
	}

}
