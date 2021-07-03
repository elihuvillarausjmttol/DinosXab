package math;

import org.junit.Test;

/**
 * A class that provides test cases for the 
 * method factorial of the MyMath
 * class, for illustrating Unit Testing.
 */

public class MyMathTest {
	
	MyMath mm = new MyMath();
	/*
	 * The following test method throws an exception if
	 *  the argument passed in the factorial method is negative.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testShouldThrowExceptionForNegativeNumber() {
	mm.factorial(-1); 
	}
	/*
	 * The following test method throws an exception if
	 *  the argument passed in the isPrime method is smaller than 2.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testShouldThrowExceptionForNumberSmallerThan2() {
	mm.isPrime(1); 
	}
	
	
	
}
