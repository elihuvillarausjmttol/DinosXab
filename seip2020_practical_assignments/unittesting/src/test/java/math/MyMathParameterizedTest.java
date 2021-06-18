package math;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Assert;

/**
 * A class that provides test cases for the 
 * method factorial of the MyMath
 * class, for illustrating Unit Testing.
 */
@RunWith(Parameterized.class)
public class MyMathParameterizedTest {

		
		// the value is the id of each parameter
		@Parameter (value = 0) 
		public int number;
		@Parameter (value = 1) //Or just @Parameter(1)
		public int factorial;
		
		MyMath mm = new MyMath();
		
		/*
		 * The following method generates the input values 
		 * for the tests. 
		 */
		@Parameters
		public static Collection<Object[]> data() {
			Object[][] data = new Object[][]{{1,1},{2,2},{12,479001600}};
			
			return Arrays.asList(data);
		}
		
		/*
		 * A unit test that is executed for each parameter. 
		 */
		@Test
		public void testFactorialCases() {
			Assert.assertEquals(factorial, mm.factorial(number));
		}
		
}		


