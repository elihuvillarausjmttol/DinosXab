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
	 *  the argument passed in the factorial metod is negative.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testShouldThrowExceptionForNegativeNumber() {
	mm.factorial(-1); 
	}
}
