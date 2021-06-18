package math;

/**
 * A class that contains a method called factorial.
 * This method illustrates the way to calculate the factorial
 * of numbers ranging from 0 to 12, using a loop (not recursion).
 */
public class MyMath {
	
		public int factorial(int n) {
			
			int result = 1;
			if (n>12 || n<0) {
				throw new IllegalArgumentException("Cannot use numbers bigger than 12 or smaller than zero");	
			}

			 for (int factor = 2; factor <= n; factor++) {
			    result *= factor;
			 }

			  return result;
	    
		}
}

		
	
		
