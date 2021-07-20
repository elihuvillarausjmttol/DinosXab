package math;

/**
 * A class that contains a method called factorial.
 * This method illustrates the way to calculate the factorial
 * of numbers ranging from 0 to 12, using a loop (not recursion).
 */
public class MyMath {
		
		/*
		 * A method that calculates factorial of numbers ranging from 0 to 12.
		 */
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
		
		/*
		 * A method that checks if a number >=2 is a prime number
		 */
		public boolean isPrime(int n) {
			if (n<2) {
				throw new IllegalArgumentException("Number should be 2 or greater");	
			}
	        // Check from 2 to n-1 
	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false; 
	  
			return true;
		}
	
}

		
	
		
