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
     * A unit test that should return proper output. Test fails if criteria doesn't match the 0.11 margin of error. 
     * 
     */
	@Test
	public void divideReturnCorrectOutput() {
		
		Assert.assertEquals(2.1, kickstart.divide(4.0, 2.0), 0.11);	
	}
	
	/*
     * A unit test that throws an exception 
     * for Numerator and Denominator with the value of 0.
     */
	@Test(expected = ArithmeticException.class)
	public void testShouldThrowExceptionForZeroDenomAndNum() {
	kickstart.divide(0, 0); 	
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
	
	/*
	 * The following test method should work for x = 0.
	 */
	@Test
	public void testShouldGiveOutputZeroforx() {
		Assert.assertEquals(0, kickstart.multiply(0,2));
		
	}
	/*
	 * The following test method should work for y = 0.
	 */
	@Test
	public void testShouldGiveOutputZerofory() {
		Assert.assertEquals(0, kickstart.multiply(2,0));
		
	}
	
	/*
	 * The following test method should work for x smaller than max value stored in an int.
	 */
	@Test
	public void testShouldGiveNormalOutput() {
		Assert.assertEquals(6, kickstart.multiply(2,3));
		
	}

}	
