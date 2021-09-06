package math;
import static org.junit.Assert.*;
import org.junit.Test;
import io.FileIO;

import static org.mockito.Mockito.*;

public class ArrayOperationsTest {
	
	// Mock the MyMath dependency
	MyMath mm = mock(MyMath.class);
	
	/*
	 * The following test aims to test the FindPrimesInFile 
	 * of the class ArrayOperations class 
	 * the previous test_reverseArray test case. In order to 
	 * isolate the external (to this class) dependencies (MyMath)
	 * we have to mock them and predefine the results of
	 * all calls that we plan to execute on the MyMaths' methods.
	 */
	@Test
	public void testFindPrimeNumbersInFileThatStartWith() {
		FileIO fileio = mock(FileIO.class);
		
		String path = "src/test/resources/toPrime.txt";
		when(fileio.readFile(path)).thenReturn(new int[] {3,5,7,10,11,100,111,65,12});
		
		when(mm.isPrime(3)).thenReturn(true);
		when(mm.isPrime(5)).thenReturn(true);
		when(mm.isPrime(7)).thenReturn(true);
		when(mm.isPrime(10)).thenReturn(false);
		when(mm.isPrime(11)).thenReturn(true);
		when(mm.isPrime(100)).thenReturn(false);
		when(mm.isPrime(111)).thenReturn(false);
		when(mm.isPrime(65)).thenReturn(false);
		when(mm.isPrime(12)).thenReturn(false);
		
		ArrayOperations ns = new ArrayOperations();
		int[] expected = {3,5,7,11};
		int[] actual = ns.findPrimesInFile(fileio, path, mm);
		
		assertArrayEquals(expected, actual);
	}

}
