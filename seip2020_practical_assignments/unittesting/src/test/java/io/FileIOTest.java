package io;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FileIOTest {
	
	
	
	FileIO fileio = new FileIO();// the constructor
	public static String resourcesPath = "src/test/resources/"; // the path for the numbers_valid file.
	
	/*
	 * normal test method that reads numbers in a file successfully.
	 */
	@Test
	public void testReadFileValidInput() {
		int[] expectedNumbers = new int[] {
				1,2,3,4,5};
		String validInputFilepath = resourcesPath.concat("numbers_valid.txt");
		
		Assert.assertArrayEquals(expectedNumbers, fileio.readFile(validInputFilepath));
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	/*
     * A unit test that throws an exception 
     * for an invalid file.
     */
	@Test 
	public void testShouldThrowExceptionForInvalidFile() {
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Input file does not exist");
		fileio.readFile("src/test/resources/bla.txt");		
	}
	/*
     * A unit test that throws an exception 
     * for a file  with a size of zero..
     */
	@Test 
	public void testShouldThrowExceptionForFileSizeZero() {
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Given file is empty");
		fileio.readFile("src/test/resources/Zero.txt");		
	}
	/*
     * A unit test that throws an exception 
     * for a file that contains not only integers but different kind
     * of variables (int,double,string).
     */
	@Test 
	public void testReadFileContainsInvalidEntries() {
		
		thrown.expect(NumberFormatException.class);
		thrown.expectMessage("The file contains other types of variables");
		fileio.readFile("src/test/resources/NotOnly.txt");		
	}
	

}
