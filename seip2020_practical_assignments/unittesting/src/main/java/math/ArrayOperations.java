package math;

import io.FileIO;
import java.util.ArrayList;
import java.util.List;

/**
 * Class ArrayOperations consisting of a method called findPrimesInFile 
 * that iterates in an array of numbers and returns a new array that 
 * contains only prime numbers. Furthermore, the method uses FileIO to read a 
 * file with numbers in the filepath location and the MyMath (to determine if a number is prime or not)
 */

public class ArrayOperations {
	
	
	public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		int[] numbers = fileIo.readFile(filepath);
		List<Integer> PrimeNumbers = new ArrayList<>();

		for (int num : numbers) {
			if (myMath.isPrime(num)) {
				PrimeNumbers.add(num);
		    }

		}
			return PrimeNumbers.stream().mapToInt(i -> i).toArray();
	
	}
		
}
	

	
	

