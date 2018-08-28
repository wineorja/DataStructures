package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cap1.arrays.Matrix;

class MatrixTest {

	@Test
	void testInsertElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(10,10);
		// Step 2. Create the expected value variable
		int[][] expectedValue = new int[10][10];
		expectedValue[0][0] = 200;
		// Step 3. Obtain the actual value
		int[][] actualValue = testedMatrix.insertElement(200, 0, 0);
		// Step 4. Compare the expected versus actual values
		assertArrayEquals(expectedValue, actualValue);
	}

	@Test
	void testSearchElement() {
		// Step 1. instantiate the tested class using the constructor method
		Matrix testedMatrix = new Matrix(10,10);
		// Step 2. Create the expected value variable
		int expectedValue = 500;
		testedMatrix.insertElement(expectedValue, 0, 0);
		// Step 3. Obtain the actual value
		int actualValue = testedMatrix.searchElement(0,0);
		// Step 4. Compare the expected versus actual values
		assertEquals(expectedValue, actualValue);
	}

}
