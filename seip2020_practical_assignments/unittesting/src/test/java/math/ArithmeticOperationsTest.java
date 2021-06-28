package math;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * A class that provides test cases for the 
 * methods divide and multiply of the ArithmeticOperations 
 * class, for illustrating Unit Testing.
 */
public class ArithmeticOperationsTest {
	
	/*
	 * creating a constructor to obtain the ArithmeticOperations properties.
	 */
	ArithmeticOperations kickstart = new ArithmeticOperations();
	
	/*
     * A unit test that throws an exception 
     * for a Denominator with the value of 0.
     */
	@Test(expected = ArithmeticException.class)
	public void testShouldThrowExceptionForZeroDenominator() {
	kickstart.divide(5, 0); 	
	}	
	
	/*
     * A unit test that throws an exception 
     * for a really big numerator in order not to distort
     * the rules concerning division.
     */
	@Test(expected = ArithmeticException.class)
	public void testShouldThrowExceptionForBigPositiveNumbers() {
	kickstart.divide(Double.MAX_VALUE, 0.001); 	
	}
	
	/*
     * A unit test that throws an exception 
     * for a really small numerator in order to not distort
     * the given rules of the devision.
     */
	@Test(expected = ArithmeticException.class)
	public void testShouldThrowExceptionForBigNegativeNumbers() {
	kickstart.divide(-Double.MAX_VALUE, 0.001); 	
	}	
	
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	/*
     * A unit test that throws an exception 
     * for multiplication of 2 negative numbers.
     */
	@Test 
	public void testShouldThrowExceptionOnNegativeInput() {
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		kickstart.multiply(-5, -1);		
	}
	
	/*
     * A unit test that throws an exception 
     * for multiplication of 2 arguments, one containing zero and
     * the other containing a positive number.
     */
	@Test
	public void testShouldReturnZero2() {
		
		Assert.assertEquals(0, kickstart.multiply(0, 2));	
	}
	
	/*
     * A unit test that throws an exception 
     * for multiplication of a negative and a positive number.
     */
	@Test 
	public void testShouldThrowExceptionOnYNegativeInput() {
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		kickstart.multiply(-5, 1);
	}
	
	/*
     * A unit test that throws an exception 
     * for multiplication of a positive and a negative number.
     */
	@Test 
	public void testShouldThrowExceptionOnXNegativeInput() {
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		kickstart.multiply(5, -1);
	}
	
	/*
     * A unit test that throws an exception 
     * for multiplication that exceeds the maximum capacity of
     *  bits stored in a variable.
     */
	@Test 
	public void testShouldThrowExceptionOnMultiplicationLimits() {
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The product does not fit in an Integer variable");
		kickstart.multiply(Integer.MAX_VALUE, 100);
	}
	

}	
