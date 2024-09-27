package com.csplusplus;

public class Unit8 {

    // 1. Method to calculate the sum of all elements in a 2D array
    // Instructions: Traverse the 2D array and calculate the sum of all elements.
    public static int sumOfElements(int[][] array) {
    	int sum = 0;
    	for (int[] r : array)
    		for (int val : r)
    			sum += val;
    	return sum;  
    }

    // 2. Method to count how many times a specific number appears in a 2D array
    // Instructions: Traverse the 2D array and count the number of times a specified value appears.
    public static int countOccurrences(int[][] array, int value) {
    	int count = 0;
    	for (int[] r : array)
    		for (int val : r)
    			if (val == value)
    				count++;
    	return count;
    }

    // 3. Method to find the maximum element in a 2D array
    // Instructions: Traverse the 2D array and find the maximum element.
    public static int findMax(int[][] array) {
    	int max = array[0][0];
    	for (int[] r : array)
    		for (int val : r)
    			if (val > max)
    				max = val;
    		return max; 
    }

    // 4. Method to reverse the rows of the 2D array
    // Instructions: Reverse the rows of the 2D array (e.g., the first row becomes the last, etc.).
    public static void reverseRows(int[][] array) {
    	for (int i = 0; i < array.length/2; i++) {
    		int[] temp = array[i];
    		array[i] = array[array.length - i - 1];
    		array[array.length - i - 1] = temp;
    	}
    		
    }

    // 5. Method to transpose a 2D array (swap rows and columns)
    // Instructions: Create and return a new 2D array that is the transpose of the input array.
    public static int[][] transpose(int[][] array) {
    	int rows = array.length;
    	int cols = array[0].length;
    	int[][] tp = new int[cols][rows];
    	for (int r = 0; r < array.length; r++)
    		for (int c = 0; c < array[0].length; c++)
    			tp[c][r] = array[r][c];
    	return tp;  
    }

    // 6. Method to fill a 2D array with random integers
    // Instructions: Create a 2D array of size numRows x numCols and fill it with random integers between min and max.
    public static int[][] fillWithRandom(int min, int max, int numRows, int numCols) {
    	int[][] rand = new int[numRows][numCols];
    	for (int r = 0; r < rand.length; r++)
    		for (int c = 0; c < rand[0].length; c++) {
    			int ran = (int) (min + Math.random() * max);
    			rand[r][c] = ran;
    		}		
    	return rand; 
    }
}